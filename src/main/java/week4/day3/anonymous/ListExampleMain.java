package week4.day3.anonymous;

import java.util.List;

public class ListExampleMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
