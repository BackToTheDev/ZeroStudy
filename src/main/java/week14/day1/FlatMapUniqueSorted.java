package week14.day1;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class FlatMapUniqueSorted {
    public static void main(String[] args) {
        List<String> sentences = List.of(
                "Java is fun",
                "Fun with Java and Stream"
        );

        List<String> result = sentences.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .map(String::toLowerCase)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
