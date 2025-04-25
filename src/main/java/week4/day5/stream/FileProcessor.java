// BE 36_권준성

package week4.day5.stream;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

@FunctionalInterface
public interface FileProcessor {
    String process(String line);
}

class StreamMain {
    public static void main(String[] args) {
        String filepath = "src/main/resources/test.txt";

        FileProcessor processor = line -> line.toUpperCase();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(new FileInputStream(filepath)))) {

            reader.lines()
                    .map(processor::process)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
