package week13.day4;
import java.util.Map;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class NameStream {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Charlie");

        String joined = names.stream()
                .collect(Collectors.joining(" & ", "이름: ", "."));

        System.out.println(joined);
    }
}
