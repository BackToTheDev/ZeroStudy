package week14.day1;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class FlatMapStream {
    public static void main(String[] args) {
        List<String> sentences = List.of(
                "I love Java",
                "Stream is powerful"
        );

        List<String> words = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toList());

        System.out.println(words);
    }
}
