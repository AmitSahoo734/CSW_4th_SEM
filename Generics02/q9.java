package CSW_Sem_4.src.Generics02;

import java.util.HashSet;

public class q9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 5};

        printRepeatingIntegers(array);
    }

    public static void printRepeatingIntegers(int[] array) {
        HashSet<Integer> once = new HashSet<>();
        HashSet<Integer> repeating = new HashSet<>();

        for (int num : array) {
            if (!once.add(num)) {
                repeating.add(num);
            }
        }
        System.out.println("Repeating integers in the array:");
        for (int num : repeating) {
            System.out.print(num + " ");
        }
    }
}

