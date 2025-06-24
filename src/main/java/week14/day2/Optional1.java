package week14.day2;
import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        Optional<String> name = Optional.of("Alice");
        name.ifPresent(s -> System.out.println("Hello, " + s));

        Optional<String> empty = Optional.empty();
        String result = empty.orElse("goat");
        System.out.println(result);
    }
}
