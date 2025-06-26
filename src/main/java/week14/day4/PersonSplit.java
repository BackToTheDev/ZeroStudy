package week14.day4;
import java.util.List;
import java.util.stream.Collectors;

public class PersonSplit {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Alice", 30),
                new Person("Bob", 31),
                new Person("Charlie", 32),
                new Person("Dog", 33),
                new Person("Evil", 34)
        );

       String names = persons.stream()
                .map(Person::getName)
                .collect(Collectors.joining(", "));

       System.out.println(names);
    }
}
