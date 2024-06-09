package CSW_Sem_4.src.Generics02;

import java.util.Hashtable;
import java.util.Map;

public class q10 {
    public static void main(String[] args) {
        String largeString = "A young boy enters a barber shop and the barber whispers to his customer, This is the dumbest kid in the world. Watch while I prove it to you.";

        Map<String, Integer> wordFrequency = new Hashtable<>();

        String[] words = largeString.split("\\s+");

        for (String word : words) {
            String lowercaseWord = word.toLowerCase();

            if (wordFrequency.containsKey(lowercaseWord)) {
                int frequency = wordFrequency.get(lowercaseWord);
                wordFrequency.put(lowercaseWord, frequency + 1);
            } else {
                wordFrequency.put(lowercaseWord, 1);
            }
        }

        int maxFrequency = 0;
        for (int frequency : wordFrequency.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        System.out.println("Most occurring words in the string:");
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                System.out.println(entry.getKey() + " : " + maxFrequency + " times");
            }
        }
    }
}
