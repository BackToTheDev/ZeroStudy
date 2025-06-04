package week11.day2;
import java.util.*;
import java.util.stream.*;

class Employee2 {
    String name;
    int age;
    double salary;

    public Employee2(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}

public class EmployeeMain2 {
    public static void main(String[] args) {
        List<Employee2> list = Arrays.asList(
                new Employee2("홍길동", 30, 50000),
                new Employee2("김철수", 25, 60000),
                new Employee2("이영희", 31, 40000),
                new Employee2("박민수", 40, 70000)
        );

        List<Employee2> result = list.stream()
                .sorted((s1, s2) -> {
                    int compareSalary = Double.compare(s2.getSalary(), s1.getSalary());
                    if (compareSalary != 0) return compareSalary;

                    int compareAge  = Integer.compare(s1.getAge(), s2.getAge());
                    if (compareAge != 0) return compareAge;

                    return s1.getName().compareTo(s2.getName());
                })
                .collect(Collectors.toList());

        result.forEach(e ->
                System.out.println(e.getName() + " " + e.getAge() + " " + e.getSalary())
        );
    }
}
