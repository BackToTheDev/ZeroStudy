package week12.day5;
import java.util.stream.Stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.List;

public class GroupingStream {
    public static void main (String[] args) {
        Path path = Path.of("src/main/resources/words.txt");

        try (Stream<String> lines = Files.lines(path)) {
           Map<Integer, List<String>> grouped =  lines.map(String::toUpperCase)
                    .distinct()
                    .collect(Collectors.groupingBy(String::length));

           grouped.forEach((length, words) ->{
               System.out.println(length + ": " + words);
            });

        } catch (IOException e) {
            System.err.println("파읽 읽는 도중 오류 발생: " + e.getMessage());
        }
    }

}
