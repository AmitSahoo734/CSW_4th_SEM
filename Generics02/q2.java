package CSW_Sem_4.src.Generics02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class ArrayListUser {
    List<User> userList = new ArrayList<>();

    public void addUser(User user) {
        userList.add(user);
    }

    public void printUsers() {
        for (User user : userList) {
            System.out.println("Name: " + user.getName() + ", Age: " + user.getAge());
        }
    }

    public void sortUsersByAge() {
//        Collections.sort(userList);
    }
}

public class q2 {
    public static void main(String[] args) {

    }
}
