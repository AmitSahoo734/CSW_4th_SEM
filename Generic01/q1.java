package CSW_Sem_4.src.Generic01;
class Student<T>{
    String name;
    T rollNumber; // Can be Integer or String
    int age;
    public Student(String name, T rollNumber, int age) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.age = age;
    }
    public void display(){
        System.out.println("Name "+name+" Rollnumber "+ rollNumber +" Age "+age);
    }
}

public class q1 {
    public static void main(String[] args) {
        Student<String> student_Obj1 = new Student<>("Amit" , "9152" , 19);
        Student<Integer> student_Obj2 = new Student<>("Amit" , 9152 , 19);
        student_Obj1.display();
        student_Obj2.display();
    }
}
