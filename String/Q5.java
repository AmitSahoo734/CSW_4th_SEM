package CSW_Sem_4.src.String;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base string:");
        String baseString = scanner.nextLine();
        System.out.println("Enter the number of concatenations:");
        int numConcatenations = scanner.nextInt();

        // Using StringBuilder
        System.out.println("\nUsing StringBuilder...");
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder(baseString);
        for (int i = 1; i < numConcatenations; i++) {
            stringBuilder.append(baseString);
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        long timeTakenStringBuilder = endTimeStringBuilder - startTimeStringBuilder;

        System.out.println("Time taken: " + timeTakenStringBuilder + " milliseconds");
        System.out.println("Final string length: " + stringBuilder.length());

        //Using StringBuffer
        System.out.println("\nUsing StringBuffer...");
        long startTimeStringBuffer = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer(baseString);
        for (int i = 1; i < numConcatenations; i++) {
            stringBuffer.append(baseString);
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        long timeTakenStringBuffer = endTimeStringBuffer - startTimeStringBuffer;

        System.out.println("Time taken: " + timeTakenStringBuffer + " milliseconds");
        System.out.println("Final string length: " + stringBuffer.length());
        long timeDifference = timeTakenStringBuffer - timeTakenStringBuilder;
        String faster = (timeDifference > 0) ? "StringBuilder" : "StringBuffer";
        timeDifference = Math.abs(timeDifference);
 System.out.println("\nComparison: " + faster + " was faster than " +
                ((faster.equals("StringBuilder")) ? "StringBuffer" : "StringBuilder") +
                " by " + timeDifference + " milliseconds.");

        scanner.close();
    }
}
