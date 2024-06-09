package CSW_Sem_4.src.Generics02;
import java.util.HashMap;

public class q8 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (areAnagrams(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are anagrams.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> frequency = new HashMap<>();

        for (char c : str1.toCharArray()) {
            frequency.put(c, frequency.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            if (!frequency.containsKey(c)) {
                return false;
            }
            int currentFrequency = frequency.get(c);
            if (currentFrequency == 1) {
                frequency.remove(c);
            } else {
                frequency.put(c, currentFrequency - 1);
            }
        }

        return frequency.isEmpty();
    }
}

