package CSW_Sem_4.src.GarbageCollection;

import java.util.ArrayList;
import java.util.Date;

class DataHolder1 {
    private int intValue;
    private double doubleValue;

    public DataHolder1(int intValue, double doubleValue) {
        this.intValue = intValue;
        this.doubleValue = doubleValue;
    }
}

public class MemoryIntensiveProgram {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<DataHolder1> dataHolderList = new ArrayList<>();

        printMemoryInfo("Start");

        for (int i = 0; i < 1000000; i++) {
            dataHolderList.add(new DataHolder1(i, i * 1.0));
            if (i % 100000 == 0) {
                printMemoryInfo("After creating " + i + " objects");
            }
        }

        dataHolderList = null;

        System.gc();
        Thread.sleep(5000);

        printMemoryInfo("After GC");
    }

    private static void printMemoryInfo(String message) {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;
        System.out.println(new Date() + " - " + message);
        System.out.println("Total Memory: " + totalMemory + " bytes");
        System.out.println("Free Memory: " + freeMemory + " bytes");
        System.out.println("Used Memory: " + usedMemory + " bytes");
        System.out.println();
    }
}

