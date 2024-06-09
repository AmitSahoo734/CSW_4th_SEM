package CSW_Sem_4.src.String;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();
        String concatenatedString = string1 + string2;
        String concatenatedStringMethod = string1.concat(string2);
        System.out.println("Concatenated string using + operator: " + concatenatedString);
        System.out.println("Concatenated string using concat method: " + concatenatedStringMethod);
        System.out.print("Enter an index number: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < concatenatedString.length()) {
            System.out.println("Character at index " + index + ": " + concatenatedString.charAt(index));
        } else {
            System.out.println("Index out of range.");
        }
       scanner.close();
    }
}
