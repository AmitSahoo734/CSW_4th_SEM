package CSW_Sem_4.src.GarbageCollection;

import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String name;
    private int id;
    private String course;

    public Student(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.name + ", ID: " + this.id + ", Course: " + this.course);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Student object with ID " + this.id + " is being garbage collected.");
        super.finalize();
    }

    public static void main(String[] args) throws InterruptedException {
        Runtime runtime = Runtime.getRuntime();

        printMemoryInfo("Start");
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            students.add(new Student("Student" + i, i, "Course" + (i % 10)));
            if (i % 20 == 0) {
                printMemoryInfo("After enrolling " + i + " students");
            }
        }

        for (int i = 0; i < students.size(); i+=10) {
            students.get(i).displayInfo();
        }

        students = null;

        System.gc();
        Thread.sleep(5000);

        printMemoryInfo("After GC");

        System.out.println("End of main method.");
    }

    // Method to print memory information with a custom message
    private static void printMemoryInfo(String message) {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;
        System.out.println(new Date() + " - " + message);
        System.out.println("Total Memory: " + totalMemory/1024 + " bytes");
        System.out.println("Free Memory: " + freeMemory + " bytes");
        System.out.println("Used Memory: " + usedMemory + " bytes");
        System.out.println();
    }
}
