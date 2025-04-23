package week4.day3.stream;

import net.datafaker.Faker;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class IntermediateOperationTest {
    private final Faker faker = new Faker();

    @Test
    void filter() {
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10);
//        List<Integer> numbers = new ArrayList<>();
//        for (int i = 1; i <= 10; i++) {
//            numbers.add(i);
//        }
//
//        List<Integer> evenNumbers = numbers.stream()
//                .filter(number -> number % 2 == 0)
//                .toList();

        List<Integer> evenNumbers = IntStream.rangeClosed(1, 10)
                        .filter(number -> number % 2 == 0)
                                .boxed()
                                        .toList();

        System.out.println(evenNumbers);

    }
    @Test
    void map() {
        List<String> names = Stream.generate(() -> faker.name().fullName())
                .limit(10)
                .toList();
        System.out.println(names);

        List<Integer> nameLengths = names.stream()
                .map(s -> s.length())
                .toList();
        System.out.println(nameLengths);
    }

    @Test
    void mapVsFlatMap() {
        List<List<String>> names = Stream.generate(() -> faker.name().firstName())
                .limit(10)
                .map(s -> List.of(s.split("")))
                .toList();
        System.out.println(names);






    }
}