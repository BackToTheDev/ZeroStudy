package week11.day4;
import java.util.*;
import java.util.stream.*;
import java.io.*;

class User {
    String name;
    int age;
    boolean isActive;

    public User (String name, int age, boolean isActive) {
        this.name = name;
        this.age = age;
        this.isActive = isActive;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public String toString() {
        return "[" + name + ", " + age + ", " + (isActive ? "활성" : "비활성") + "]";
    }
}

public class UserMain {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Alice", 22, true),
                new User("Bob", 27, true),
                new User("Charlie", 30, false),
                new User("Diana", 25, true),
                new User("Eve", 35, true)
        );

        List<String> names = users.stream()
                .filter(u -> u.age >= 25 && u.isActive == true)
                .map(u -> u.getName().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(names);

        List<User> user1 = Arrays.asList(
                new User("Alice", 32, false),
                new User("Bob", 40, true),
                new User("Charlie", 35, false),
                new User("Eva", 29, false)
        );

        List<String> name = user1.stream()
                .filter(u -> u.age >= 30 && u.isActive == false && u.name.length() >= 5)
                .map(u -> u.getName().toLowerCase())
                .collect(Collectors.toList());

        System.out.println(name);
    }
}
