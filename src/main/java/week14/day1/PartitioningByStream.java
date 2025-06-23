package week14.day1;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class PartitioningByStream {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        Map<Boolean, List<Integer>> result = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        result.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}
