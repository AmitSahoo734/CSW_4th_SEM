package CSW_Sem_4.src.OOPs;
class College {
    String collegeName;
    String collegeLoc;

    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public void displayCollegeInfo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Location: " + collegeLoc);
    }
}

class Student {
    int studentId;
    String studentName;
    College college;

    public Student(int studentId, String studentName, College college) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void displayStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("College Info:");
        college.displayCollegeInfo();
    }
}

public class Q5 {
    public static void main(String[] args) {
        College college1 = new College("ABC College", "City A");
        College college2 = new College("XYZ College", "City B");

        Student student1 = new Student(1, "Alice", college1);
        Student student2 = new Student(2, "Bob", college2);

        // System.out.println("College Information:");
        // System.out.println("---------------");
        // college1.displayCollegeInfo();
        // System.out.println("---------------");
        // college2.displayCollegeInfo();
        // System.out.println("---------------");

        System.out.println("Student Information:");
        System.out.println("---------------");
        student1.displayStudentInfo();
        System.out.println("---------------");
        student2.displayStudentInfo();
        System.out.println("---------------");
    }
}
