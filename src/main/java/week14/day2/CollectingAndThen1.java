package week14.day2;
import java.util.List;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.stream.Collectors;


public class CollectingAndThen1 {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        List<String> result = names.stream()
                .collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));

        System.out.println(result);
    }
}
