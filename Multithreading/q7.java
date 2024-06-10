package CSW_Sem_4.src.Multithreading;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class q7 {

    // Simulate fetching data from a remote server
    public static CompletableFuture<String> fetchDataFromServer(String serverName) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                // Simulate delay
                int delay = ThreadLocalRandom.current().nextInt(1, 4);
                TimeUnit.SECONDS.sleep(delay);
                return "Data from " + serverName;
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        });
    }

    // Simulate processing fetched data
    public static CompletableFuture<String> processData(String data) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                // Simulate processing time
                int delay = ThreadLocalRandom.current().nextInt(1, 3);
                TimeUnit.SECONDS.sleep(delay);
                return "Processed " + data;
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
        });
    }

    public static void main(String[] args) {
        // Fetch data from two servers asynchronously
        CompletableFuture<String> fetchServer1 = fetchDataFromServer("Server 1");
        CompletableFuture<String> fetchServer2 = fetchDataFromServer("Server 2");

        // Process the fetched data
        CompletableFuture<String> processServer1 = fetchServer1.thenCompose(q7::processData);
        CompletableFuture<String> processServer2 = fetchServer2.thenCompose(q7::processData);

        // Combine the results of the processed data
        CompletableFuture<String> combinedResult = processServer1.thenCombine(processServer2, (result1, result2) ->
                result1 + " & " + result2
        );

        // Handle the final combined result
        combinedResult.thenAccept(result ->
                System.out.println("Combined Result: " + result)
        );

        // Ensure the main thread waits for the completion of all tasks
        try {
            combinedResult.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}

