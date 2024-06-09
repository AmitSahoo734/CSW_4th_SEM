package CSW_Sem_4.src.Generics02;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Student {
    private String name;
    private int age;
    private double mark;

    public Student(String name, int age, double mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getMark() {
        return mark;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Student student = (Student) obj;
        return age == student.age &&
                Double.compare(student.mark, mark) == 0 &&
                name.equals(student.name);
    }
}
public class q4 {
    public static void main(String[] args) {
        List<Student> allStudent = new LinkedList<>();
        allStudent.add(new Student("Amit", 20, 85.5));
        allStudent.add(new Student("Bimal", 22, 78.9));
        allStudent.add(new Student("Chaman", 21, 90.0));
        // a.
        for(Student s : allStudent){
            System.out.println(s.getName()+" - "+s.getAge()+" - "+s.getMark());
        }

        // b.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sudent values :: ");
        System.out.print("name :");
        String n = sc.nextLine();
        System.out.print("Age :");
        int a = sc.nextInt();
        System.out.print("mark :");
        double m = sc.nextDouble();
        Student search = new Student(n,a,m);
        boolean found = false;
        for (Student student : allStudent) {
            if (student == search) {        //true when memory locations are same for both Objects
                found = true;
                break;
            }
        }
        if (allStudent.contains(search)) {
            System.out.println("Student exists in list . .");
            if (found) {
                System.out.println("The object is searched according to reference.");
            } else {
                System.out.println("The object is searched according to content.");
            }
        } else {
            System.out.println("Student does not exist in the list.");
        }

        // c.
        allStudent.remove(search);
        System.out.println("After removing ::");
        for(Student s : allStudent){
            System.out.println(s.getName()+" - "+s.getAge()+" - "+s.getMark());
        }
        
        // d.
        System.out.println("Number of objects in the list: " + allStudent.size());

        // e.
        Student s1 = new Student("Panmasala", 32, 70.9);
        Student s2 = new Student("Panmasala", 32, 70.9);
        System.out.println(s1.equals(s2));
    }
}
