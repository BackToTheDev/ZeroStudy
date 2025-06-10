package week12.day2;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StreamExceptionExample {
    public static void main(String[] args) {
        Path path = Path.of("src/main/resources/words.txt");

        try (Stream<String> lines = Files.lines(path)) {
            lines.filter(line -> line.length() >= 5)
                    .map(line -> line.toUpperCase()).sorted()
                    .forEach(System.out::println);

        } catch (IOException e) {
            System.err.println("파일을 읽는 도중 오류 발생: " + e.getMessage());
        }
    }
}
