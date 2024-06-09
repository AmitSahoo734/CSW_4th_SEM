package CSW_Sem_4.src.String;
public class Q1 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");
        String str4 = new String("Hello");
        System.out.println("Memory usage:");
        System.out.println("str1 and str2 memory addresses: " + (str1 == str2));
        System.out.println("str3 and str4 memory addresses: " + (str3 == str4));
        System.out.println("str1 and str3 memory addresses: " + (str1 == str3));
// String comparison using .equals() method compares the content of the strings
// while using == compares the memory addresses of the objects.
        System.out.println("\nString comparison:");
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        System.out.println("str1.equals(str3): " + str1.equals(str3));
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
    }
}
