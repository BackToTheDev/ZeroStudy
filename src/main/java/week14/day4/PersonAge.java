package week14.day4;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class PersonAge {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Alice", 29),
                new Person("Bob", 32),
                new Person("Charlie", 33),
                new Person("Diana", 34),
                new Person("Eve", 21)
        );

        double age = persons.stream()
                .collect(Collectors.averagingInt(Person::getAge));

        System.out.println(age);
    }
}
