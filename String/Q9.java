package CSW_Sem_4.src.String;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        
        System.out.println("Enter the word to search for:");
        String searchWord = scanner.next();
        
        System.out.println("Enter the word to replace it with:");
        String replacementWord = scanner.next();
        
        int index = sentence.indexOf(searchWord);
        
        if (index != -1) {
           
            String modifiedSentence = sentence.substring(0, index) + replacementWord + sentence.substring(index + searchWord.length()); 
            System.out.println("Original Sentence: " + sentence);
            System.out.println("Modified Sentence: " + modifiedSentence);
        } else {
            System.out.println("Word not found in the sentence.");
        }
        
        scanner.close();
    }
}
