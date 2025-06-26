package week14.day4;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMap {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Alice", 30),
                new Person("Bob", 31),
                new Person("Charlie", 32),
                new Person("Diana", 33),
                new Person("Eve", 21)
        );
        Map<Boolean, List<Person>> mapPerson = persons.stream()
                .collect(Collectors.partitioningBy(p -> p.getAge() >= 30));

        mapPerson.forEach((key, list) -> {
                System.out.println(key ? "30세 이상" : "30세 미만");
                list.forEach(System.out::println);
        });


    }
}
