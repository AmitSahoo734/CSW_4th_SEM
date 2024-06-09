package CSW_Sem_4.src.GarbageCollection;

public class NullifiedReference {
    private String name;

    public NullifiedReference(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + " is being garbage collected.");
        super.finalize();
    }

    public static void main(String[] args) throws InterruptedException {
        NullifiedReference ref = new NullifiedReference("Nullified Object");

        ref = null;

        System.gc();
        Thread.sleep(1000);

        System.out.println("End of main method.");
    }
}
