package week13.day5;
import java.util.Map;
import java.util.List;
import java.util.Collection;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        List<List<String>> nested = List.of (
                List.of("a", "b"),
                List.of("c", "d"),
                List.of("e")
        );

        List<String> flat = nested.stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println(flat);
    }
}
