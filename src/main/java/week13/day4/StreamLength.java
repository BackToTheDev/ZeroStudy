package week13.day4;
import java.util.Map;
import java.util.List;
import java.util.Optional;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamLength {
    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/words.txt");

        try (Stream<String> line = Files.lines(path)) {
            Map<Integer, Optional<String>> grouped =
                    line.map(String::toUpperCase)
                            .distinct()
                            .collect(Collectors.groupingBy(String::length, Collectors.maxBy(Comparator.comparing(String::length))));

            grouped.forEach((k, v) -> v.ifPresent(word -> System.out.println(k + ": " + word)));
        } catch (IOException e) {
            System.err.println("파일 읽는 중 오류 발생: " + e.getMessage());
        }
    }
}
