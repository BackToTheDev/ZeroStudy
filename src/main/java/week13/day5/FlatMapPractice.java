package week13.day5;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class FlatMapPractice {
    public static void main(String[] args) {
        List<String> sentences = List.of(
                "I love Java And I love coding",
                "Java stream is powerful and flexible",
                "Coding in Java is fun"
        );

        List<String> words = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());

        Map<String, Long> result = words.stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(result);
    }
}
