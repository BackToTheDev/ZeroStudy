package week12.day2;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordsStreamExample {
    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/words.txt");

        try (Stream<String> lines = Files.lines(path)) {
            lines.filter(line -> line.startsWith("b"))
                    .map(String::toLowerCase).sorted()
                    .forEach(System.out::println);

        } catch (IOException e) {
            System.err.println("파일 입력 중 오류 발생: " + e.getMessage());
        }
    }
}
