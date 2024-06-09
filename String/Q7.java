package CSW_Sem_4.src.String;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String STR = scanner.nextLine();
        char[] charArray = STR.toCharArray();
    System.out.print("Enter a character to search in the string: ");
        char searchChar = scanner.next().charAt(0);
        int firstOccurrence = -1;
        int lastOccurrence = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == searchChar) {
                if (firstOccurrence == -1) {
                    firstOccurrence = i;
                }
                lastOccurrence = i;
            }
        }
        System.out.println("Character Array: " + new String(charArray));
        if (firstOccurrence != -1 && lastOccurrence != -1) {
            System.out.println("First occurrence of '" + searchChar + "': " + firstOccurrence);
            System.out.println("Last occurrence of '" + searchChar + "': " + lastOccurrence);
        } else {
            System.out.println("Character '" + searchChar + "' not found in the string.");
        }
        scanner.close();
     }
    
}
