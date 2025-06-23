package week14.day1;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class FlatMapProblem {
    public static void main(String[] args) {
        List<String> sentences = List.of(
                "Java is fun",
                "I love stream"
        );

        List<String> result = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
