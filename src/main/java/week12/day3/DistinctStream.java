package week12.day3;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;

public class DistinctStream {
    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/words.txt");

        try (Stream<String> lines = Files.lines(path)) {
            lines.map(String::toUpperCase)
                    .distinct()
                    .sorted(Comparator.comparing(String::length)
                            .thenComparing(Comparator.naturalOrder()))
                    .forEach(System.out::println);

        } catch (IOException e) {
            System.err.println("파일 읽는 도중 오류 발생: " + e.getMessage());
        }
    }
}
