package week13;
import java.util.Map;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamMapping {
    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/words.txt");

        try (Stream<String> lines = Files.lines(path)) {
            Map<Character, List<Integer>> groupedByInitialLength =
                    lines.collect(Collectors.groupingBy(s -> s.charAt(0),
                            Collectors.mapping(String::length, Collectors.toList())));

            groupedByInitialLength.forEach((k, v) -> {
                System.out.println(k + ": " + v);
            });

        } catch (IOException e) {
            System.err.println("파일 읽는 중 오류 발생: " + e.getMessage());
        }
    }
}
