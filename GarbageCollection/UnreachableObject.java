package CSW_Sem_4.src.GarbageCollection;

public class UnreachableObject {
    private String name;
    public UnreachableObject(String name) {
        this.name = name;
    }
    public void display() {
        System.out.println("Displaying: " + this.name);
    }
    public static void show() {
        UnreachableObject obj = new UnreachableObject("myObject");
        obj.display();
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + "- is being garbage collected.");
        super.finalize();
    }

    public static void main(String[] args) throws InterruptedException {
        show();

        System.gc();
        Thread.sleep(1000);

        System.out.println("End of main method.");
    }
}
