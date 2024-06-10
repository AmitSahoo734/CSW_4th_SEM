package CSW_Sem_4.src.Multithreading;
import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
class ImageProcessingTask implements Callable<File> {
    private final File imageFile;
    private final String outputDir;

    public ImageProcessingTask(File imageFile, String outputDir) {
        this.imageFile = imageFile;
        this.outputDir = outputDir;
    }

    @Override
    public File call() throws Exception {
        BufferedImage originalImage = ImageIO.read(imageFile);
        BufferedImage processedImage = resizeImage(originalImage, 200, 200); // Example: resize to 200x200

        File outputImageFile = new File(outputDir, "processed_" + imageFile.getName());
        ImageIO.write(processedImage, "jpg", outputImageFile);

        return outputImageFile;
    }

    private BufferedImage resizeImage(BufferedImage originalImage, int width, int height) {
        Image tmp = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);

        Graphics2D g2d = resizedImage.createGraphics();
        g2d.drawImage(tmp, 0, 0, null);
        g2d.dispose();

        return resizedImage;
    }
}
public class q10 {
    private static final int THREAD_COUNT = 4; // Number of threads to use
    private static final String IMAGE_DIR = "images"; // Directory containing the images
    private static final String OUTPUT_DIR = "output"; // Directory to save the processed images

    public static void main(String[] args) {
        File imageDir = new File(IMAGE_DIR);
        File outputDir = new File(OUTPUT_DIR);

        if (!outputDir.exists()) {
            outputDir.mkdirs();
        }

        File[] imageFiles = imageDir.listFiles((dir, name) -> name.endsWith(".jpg") || name.endsWith(".png"));

        if (imageFiles == null || imageFiles.length == 0) {
            System.out.println("No images found in the directory.");
            return;
        }

        ExecutorService executorService = Executors.newFixedThreadPool(THREAD_COUNT);
        List<Future<File>> futures = new ArrayList<>();

        for (File imageFile : imageFiles) {
            ImageProcessingTask task = new ImageProcessingTask(imageFile, OUTPUT_DIR);
            futures.add(executorService.submit(task));
        }

        for (Future<File> future : futures) {
            try {
                File processedImage = future.get();
                System.out.println("Processed image saved to: " + processedImage.getAbsolutePath());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
}
