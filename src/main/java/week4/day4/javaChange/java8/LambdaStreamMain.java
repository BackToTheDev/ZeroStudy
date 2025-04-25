package week4.day4.javaChange.java8;

import java.util.List;
import java.util.Optional;

public class LambdaStreamMain {
    public static void main(String[] args) {
        //Lambda + Stream
        List<String> names = List.of("Java", "Kotlin", "Python", "Script");
        names.stream()
                .filter(name -> name.length() >= 5)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // Optional
        Optional<String> maybeName = Optional.ofNullable(null);
        String name = maybeName.orElse("default");
        System.out.println(name);
    }
}
