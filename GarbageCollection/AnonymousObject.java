package CSW_Sem_4.src.GarbageCollection;

public class AnonymousObject {
    private String name;

    public AnonymousObject(String name) {
        this.name = name;
    }

    // Overriding the finalize() method to print object's name upon garbage collection
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + " is being garbage collected.");
        super.finalize();
    }

    // Main method demonstrating anonymous objects and garbage collection
    public static void main(String[] args) throws InterruptedException {
        new AnonymousObject("Anonymous Object");

        System.gc();
        Thread.sleep(1000);

        System.out.println("End of main method.");
    }
}
