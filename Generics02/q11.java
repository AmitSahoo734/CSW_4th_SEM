package CSW_Sem_4.src.Generics02;
import java.util.HashMap;
public class q11 {
    public static void main(String[] args) {
        int[] array = {3, 7, 2, 8, 4, 10, 5, 6, 1};
        int smallestMissing = findSmallestMissing(array);
        System.out.println("Smallest positive missing number: " + smallestMissing);
    }

    public static int findSmallestMissing(int[] array) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : array) {
            map.put(num, 1);
        }

        for (int i = 1; i <= 10; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return 11;
    }
}
