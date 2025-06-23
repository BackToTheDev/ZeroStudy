package week14.day1;
import java.util.Map;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class PartitioningProblem {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "dog", "banana", "cat", "avocado");

        Map<Boolean, List<String>> result = words.stream()
                .collect(Collectors.partitioningBy(s -> s.length() >= 5));

        result.entrySet().stream().
                forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
