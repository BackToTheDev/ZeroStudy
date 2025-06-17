package week13.day1;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Map;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamEntrySet {
    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/words.txt");

        try (Stream<String> line = Files.lines(path)) {
            Map<Character, Long> grouped =
                    line.map(String::toUpperCase)
                            .collect(Collectors.groupingBy(s -> s.charAt(0), Collectors.counting()));

            grouped.forEach((k, v) ->
                    System.out.println(k + ": " + v));

            System.out.println("======================");

            grouped.entrySet().stream()
                    .sorted(Map.Entry.<Character, Long> comparingByValue().reversed())
                    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));


        } catch(IOException e) {
            System.err.println("파일 읽는 중 오류 발생: " + e.getMessage());
        }
    }
}
