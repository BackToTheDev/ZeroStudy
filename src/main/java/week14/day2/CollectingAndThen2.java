package week14.day2;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class CollectingAndThen2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3, 1, 4, 2);

        int max = numbers.stream()
                .collect(Collectors.collectingAndThen(
                        Collectors.<Integer> maxBy(Comparator.naturalOrder()),
                        optional -> optional.orElse(-1)
                ));

        System.out.println(max);
    }
}
