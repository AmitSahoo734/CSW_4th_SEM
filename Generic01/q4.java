package CSW_Sem_4.src.Generic01;

class Student1 implements Comparable<Student1> {
    String name;
    int rn;
    double totalMark;
    public Student1(String name, int rn, double totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

    //helps the "Collections.sort" to compare before swapping elements -
    // this: current object
    // c1: other objects to compare
    @Override
    public int compareTo(Student1 obj) {
        if(this.rn == obj.rn && this.name== obj.name && this.totalMark==obj.totalMark)
            return 1;
        else
            return -1;
    }
}
public class q4 {
    public static void main(String[] args) {
        Student1[] students = new Student1[4];
        students[0] = (new Student1("sport-56" , 37 , 89.7));
        students[1] = (new Student1("sport-57" , 24 , 95.7));
        students[2] = (new Student1("sport-58" , 29 , 97.5));
        students[3] = (new Student1("sport-59" , 19 , 71.8));
        Student1 searchElement = new Student1("sport-57" , 24 , 95.7);
        for(int i = 0 ; i<students.length ; i++){
            if(students[i].compareTo(searchElement)==1)
                System.out.println("Found Element :: at index "+i);
        }
    }
}
