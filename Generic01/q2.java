package CSW_Sem_4.src.Generic01;
class Book{
    int bookId;
    String bookName;
    double price;
    Book(int bookId, String bookName, double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }
    @Override
    public String toString() {
        return "bookId: " + bookId + ", bookName: " + bookName + ", price: " + price ;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj ;        //this - obj1   obj - obj2
    }
}

public class q2 {
    public static void main(String[] args) {
        Book obj1 = new Book(123 , "DSA Book", 345.76);
        Book obj2 = new Book(124 , "CSW Book", 1067.93);
        if(obj1.price > obj2.price) {
            System.out.println(obj1.bookName + " is more costly");
        } else {
            System.out.println(obj2.bookName + " is more costly");
        }
        obj1.toString();
        obj2.toString();
        System.out.println(obj1.equals(obj2));
    }
}
