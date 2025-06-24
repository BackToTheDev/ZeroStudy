package week14.day2;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;

public class CollectionAndThen3 {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "avocado", "blueberry");

        List<String> result = words.stream()
                .filter(s -> s.length() >= 6)
                .map(String::toLowerCase)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(), Collections::unmodifiableList
                ));

        System.out.println(result);
    }
}
