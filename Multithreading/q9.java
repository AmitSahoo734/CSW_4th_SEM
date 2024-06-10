package CSW_Sem_4.src.Multithreading;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.Callable;
import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;


class FileProcessorTask implements Callable<Void> {
    String filePath;
    long start;
    long end;
    ConcurrentHashMap<String, AtomicInteger> wordCounts;

    public FileProcessorTask(String filePath, long start, long end, ConcurrentHashMap<String, AtomicInteger> wordCounts) {
        this.filePath = filePath;
        this.start = start;
        this.end = end;
        this.wordCounts = wordCounts;
    }

    @Override
    public Void call() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.skip(start);
            String line;
            long bytesRead = 0;

            // Skip partial line if not at the beginning
            if (start != 0) {
                reader.readLine();
            }

            while ((line = reader.readLine()) != null) {
                bytesRead += line.length();
                if (bytesRead > (end - start)) {
                    break;
                }

                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCounts.computeIfAbsent(word.toLowerCase(), k -> new AtomicInteger(0)).incrementAndGet();
                    }
                }
            }
        }

        return null;
    }
}
public class q9 {
    static int threadCount = 4;
    static String filePath = "large_text_file.txt";

    public static void main(String[] args) {
        ConcurrentHashMap<String, AtomicInteger> wordCounts = new ConcurrentHashMap<>();

        try {
            long fileSize = getFileSize(filePath);
            long chunkSize = fileSize / threadCount;

            ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
            List<Future<Void>> futures = new ArrayList<>();

            for (int i = 0; i < threadCount; i++) {
                long start = i * chunkSize;
                long end = (i == threadCount - 1) ? fileSize : (i + 1) * chunkSize;
                futures.add(executorService.submit(new FileProcessorTask(filePath, start, end, wordCounts)));
            }

            for (Future<Void> future : futures) {
                future.get();
            }

            executorService.shutdown();

            wordCounts.forEach((word, count) -> System.out.println(word + ": " + count));

        } catch (IOException | InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private static long getFileSize(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            return reader.lines().mapToLong(String::length).sum();
        }
    }
}



