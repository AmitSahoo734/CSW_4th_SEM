package CSW_Sem_4.src.Generics02;

import java.util.HashMap;
import java.util.Map;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
class Library {
    private Map<Integer, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(int id, Book book) {
        books.put(id, book);
    }

    public void displayBooks() {
        System.out.println("Books in Library:");
        for (Map.Entry<Integer, Book> entry : books.entrySet()) {
            System.out.println("Book ID: " + entry.getKey() + ", Book Details: "+entry.getValue().getId()+" - "+entry.getValue().getName()+" - "+entry.getValue().getAuthor()+" - "+entry.getValue().getQuantity());
        }
    }

    public boolean checkBookByName(String name) {
        for (Book book : books.values()) {
            if (book.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    public void removeBook(int k) {
        if (books.containsKey(k)) {
            books.remove(k);
            System.out.println("Book with ID " + k + " removed successfully.");
        } else {
            System.out.println("Book with ID " + k + " not found in the library.");
        }
    }
}

public class q5 {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(3409, "Java Programming", "allaa", 5);
        Book book2 = new Book(7845, "Data Structures", "akbar", 3);

        library.addBook(17 , book1);
        library.addBook(18, book2);

        library.displayBooks();

        String bookNameToCheck = "Java Programming";
        boolean isBookPresent = library.checkBookByName(bookNameToCheck);
        if (isBookPresent) {
            System.out.println("The book with name '" + bookNameToCheck + "' is present in the library.");
        } else {
            System.out.println("The book with name '" + bookNameToCheck + "' is not present in the library.");
        }

        int bookIdToRemove = 17;
        library.removeBook(bookIdToRemove);

        library.displayBooks();
    }
}
