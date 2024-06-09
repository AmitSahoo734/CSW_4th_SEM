package CSW_Sem_4.src.GarbageCollection;

public class DataHolder {
    private int intValue;
    private double doubleValue;
    public DataHolder(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }

    public void setIntValue(int intValue) {
        this.intValue = intValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public void updateValues(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("DataHolder object is being garbage collected.");
        super.finalize();
    }

    public static void main(String[] args) throws InterruptedException {
        Runtime runtime = Runtime.getRuntime();

        DataHolder obj1 = new DataHolder(10, 20.5);
        DataHolder obj2 = new DataHolder(30, 40.5);

        obj1.setIntValue(15);
        obj1.setDoubleValue(25.5);
        obj2.updateValues(35, 45.5);

        long beforeUsedMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used before GC: " + beforeUsedMemory + " bytes");

        obj1 = null;
        obj2 = null;

        System.gc();
        Thread.sleep(1000);  // 1 second

        long afterUsedMemory = runtime.totalMemory() - runtime.freeMemory();
        System.out.println("Memory used after GC: " + afterUsedMemory + " bytes");

        System.out.println("Total memory: " + runtime.totalMemory() + " bytes");
    }
}

