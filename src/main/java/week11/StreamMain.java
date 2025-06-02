package week11;
import java.util.*;
import java.util.stream.*;

class User {
    String name;
    int age;

    public User (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class StreamMain {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("철수", 18),
                new User("영희", 22),
                new User("민수", 25),
                new User("지수", 17)
        );

        List<String> adultNames = users.stream()
                .filter(user -> user.getAge() >= 20)
                .map(User::getName) // (user -> user.getName())
                .collect(Collectors.toList());

        System.out.println("성인 사용자 이름 : " + adultNames);
    }
}
