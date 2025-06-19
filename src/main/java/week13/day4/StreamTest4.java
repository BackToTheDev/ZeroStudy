package week13.day4;
import java.util.Map;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamTest4 {
    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/words.txt");

        try (Stream<String> line = Files.lines(path)) {
            Map<Character, List<String>> grouped =
                    line.map(String::toUpperCase)
                            .distinct()
                            .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.toList()));

            grouped.entrySet().stream()
                    .sorted(Map.Entry.<Character, List<String>> comparingByKey())
                    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
        } catch (IOException e) {
            System.err.println("파일 읽는 중 오류 발생: " + e.getMessage());
        }
    }
}
