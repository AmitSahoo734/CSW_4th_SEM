package CSW_Sem_4.src.Generics02;

import java.util.Scanner;
import java.util.TreeSet;

public class q6 {
    public static void main(String[] args) {
        TreeSet<Integer> numberSet = new TreeSet<>();

        numberSet.add(5);
        numberSet.add(10);
        numberSet.add(15);
        numberSet.add(20);

        // a.
        System.out.println("TreeSet of numbers: " + numberSet);

        // b.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int searchNumber = scanner.nextInt();
        if (numberSet.contains(searchNumber)) {
            System.out.println("The number " + searchNumber + " is present in the TreeSet.");
        } else {
            System.out.println("The number " + searchNumber + " is not present in the TreeSet.");
        }

        // c.
        System.out.print("Enter a number to remove: ");
        int numberToRemove = scanner.nextInt();
        if (numberSet.contains(numberToRemove)) {
            numberSet.remove(numberToRemove);
            System.out.println("The number " + numberToRemove + " is removed from the TreeSet.");
            System.out.println("TreeSet after removal: " + numberSet);
        } else {
            System.out.println("The number " + numberToRemove + " is not present in the TreeSet.");
        }
    }
}
