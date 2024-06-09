package CSW_Sem_4.src.String;
public class Q2 {
    public static void main(String[] args) {
       
        String originalString = "Hello";
        String modifiedString = originalString.toUpperCase(); 
 System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
        CharSequence charSequence = "Java is versatile!";
        System.out.println("\nCharSequence: " + charSequence);

       
        System.out.println("Length: " + charSequence.length());
 int index = 5;
        System.out.println("Character at index " + index + ": " + charSequence.charAt(index));

        String strFromCharSequence = charSequence.toString();
        System.out.println("String from CharSequence: " + strFromCharSequence);

    }    
}
