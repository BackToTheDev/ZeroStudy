package week4.day4.javaChange.java10;

import java.util.List;

public class VarMain {
    public static void main(String[] args) {
        var message = "Hello, var!";
        var numbers = List.of(1, 2, 3, 4);

        System.out.println(message);
        numbers.forEach(System.out::println);
    }
}
