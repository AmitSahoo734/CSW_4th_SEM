package CSW_Sem_4.src.String;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String firstLower = firstString.toLowerCase();
        String firstUpper = firstString.toUpperCase();
    String secondLower = secondString.toLowerCase();
        String secondUpper = secondString.toUpperCase();
        boolean isEqual = firstLower.equalsIgnoreCase(secondLower);
        System.out.println("\nConverted Strings:");
        System.out.println("First String - Lowercase: " + firstLower);
        System.out.println("First String - Uppercase: " + firstUpper);
        System.out.println("Second String - Lowercase: " + secondLower);
        System.out.println("Second String - Uppercase: " + secondUpper);
        System.out.println("\nAre the strings equal (case-insensitive)? " + isEqual);

        scanner.close();
    }
}
