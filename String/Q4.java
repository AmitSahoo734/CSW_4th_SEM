package CSW_Sem_4.src.String;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder text = new StringBuilder();

        while (true) {
            System.out.println("Current String: " + text);
            System.out.println("Choose an operation:");
            System.out.println("1. Add a substring at a specified position");
            System.out.println("2. Remove a range of characters");
            System.out.println("3. Modify a character at a specified index");
            System.out.println("4. Concatenate another string at the end");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the substring to add:");
                    String substring = scanner.nextLine();
                    System.out.println("Enter the position to add:");
                    int position = scanner.nextInt();
                    text.insert(position, substring);
                    break;
                case 2:
                    System.out.println("Enter the starting index of the range to remove:");
                    int startIndex = scanner.nextInt();
                    System.out.println("Enter the ending index of the range to remove:");
                    int endIndex = scanner.nextInt();
                    text.delete(startIndex, endIndex);
                    break;
                case 3:
                    System.out.println("Enter the index of the character to modify:");
                    int index = scanner.nextInt();
                    System.out.println("Enter the new character:");
                    char newChar = scanner.next().charAt(0);
                    text.setCharAt(index, newChar);
                    break;
                case 4:
                    System.out.println("Enter the string to concatenate:");
                    String concatString = scanner.nextLine();
                    text.append(concatString);
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 5.");
            }
            scanner.close();
        } 
    }
    
}
