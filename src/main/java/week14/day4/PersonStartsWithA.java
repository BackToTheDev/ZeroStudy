package week14.day4;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonStartsWithA {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Alice", 29),
                new Person("Bob", 30),
                new Person("Ana", 31),
                new Person("Diana", 32),
                new Person("Eve", 21)
        );

        List<String> Anames = persons.stream()
                .map(Person::getName)
                .filter(p -> p.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println(Anames);
    }
}
