package week14.day3;
import java.util.List;
import java.util.Collections;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Comparator;


public class PersonMain {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Alice", 30),
                new Person("Bob", 31),
                new Person("Charlie", 27),
                new Person("Diana", 35)
        );

        List<Person> result = persons.stream()
                .filter(p -> p.getAge() >= 30)
                .collect(Collectors.toList());

        System.out.println(result);

        List<String> names = persons.stream()
                .filter(p -> p.getAge() >= 30)
                .map(Person::getName)
                        .collect(Collectors.toList());

        System.out.println(names);


    }
}
