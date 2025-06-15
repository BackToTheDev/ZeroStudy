package week12.day5;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;


public class GroupByStream {
    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/words.txt");

        try (Stream<String> lines = Files.lines(path)) {
            Map<Character, List<String>> grouped =
                    lines.map(String::toUpperCase)
                            .distinct()
                            .collect(Collectors.groupingBy(s -> s.charAt(0)));

            grouped.forEach((character, words) -> {
               System.out.println(character + ": " + words);
            });

        } catch (IOException e) {
            System.err.println("파일 읽는 중 오류 발생: " + e.getMessage());
        }
    }
}
