package week14.day4;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Alice", 30),
                new Person("Bob", 31),
                new Person("Charlie", 32),
                new Person("Diana", 33),
                new Person("Eve", 21)
        );

        List<Person> result = persons.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
