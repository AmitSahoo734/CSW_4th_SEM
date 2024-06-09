package CSW_Sem_4.src.String;
import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Interactive String Explorer!");
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Convert to lowercase");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Search for a character");
            System.out.println("4. Search for index of a character");
            System.out.println("5. Concatenate with another string");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("Result: " + inputString.toLowerCase());
                    break;
                case 2:
                    System.out.println("Result: " + inputString.toUpperCase());
                    break;
                case 3:
                    System.out.print("Enter character to search: ");
                    char searchChar = scanner.nextLine().charAt(0);
                    if (inputString.contains(String.valueOf(searchChar))) {
                        System.out.println("Character '" + searchChar + "' found in the string.");
                    } else {
                        System.out.println("Character '" + searchChar + "' not found in the string.");
                    }
                    break;
                case 4:
                    System.out.print("Enter character to search for index: ");
                    char indexChar = scanner.nextLine().charAt(0);
                    int index = inputString.indexOf(indexChar);
                    if (index != -1) {
                        System.out.println("Index of character '" + indexChar + "': " + index);
                    } else {
                        System.out.println("Character '" + indexChar + "' not found in the string.");
                    }
                    break;
                case 5:
                    System.out.print("Enter string to concatenate: ");
                    String concatString = scanner.nextLine();
                    System.out.println("Result: " + inputString.concat(concatString));
                    break;
                case 6:
                    System.out.println("Exiting Interactive String Explorer. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
            scanner.close();
        }
    
    }
}
