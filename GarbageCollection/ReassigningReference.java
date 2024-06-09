package CSW_Sem_4.src.GarbageCollection;

public class ReassigningReference {
    private String name;

    public ReassigningReference(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + " is being garbage collected.");
        super.finalize();
    }

    public static void main(String[] args) throws InterruptedException {
        ReassigningReference ref1 = new ReassigningReference("Object 1");
        ReassigningReference ref2 = new ReassigningReference("Object 2");

        ref1 = ref2;

        System.gc();
        Thread.sleep(1000);

        System.out.println("End of main method.");
    }
}
