package week13.day5;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.Collection;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class FlatMap2 {
    public static void main(String[] args) {
        List<String> sentences = List.of(
               "I love Java",
                "Stream is powerful",
                "flatMap is useful"
        );

        List<String> words = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());

        System.out.println(words);
    }
}
