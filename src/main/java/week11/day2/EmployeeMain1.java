package week11.day2;
import java.util.*;
import java.util.stream.*;

class Employee1 {
    String name;
    int age;
    double salary;

    public Employee1(String name, int age, double salary) {
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

public class EmployeeMain1 {
    public static void main(String[] args) {
        List<Employee1> list = Arrays.asList(
                new Employee1("홍길동", 30, 50000),
                new Employee1("김철수", 25, 60000),
                new Employee1("이영희", 31, 40000),
                new Employee1("박민수", 40, 75000)
        );

        List<Employee1> result = list.stream().
                sorted(
                        Comparator.comparing(Employee1::getSalary).reversed()
                                .thenComparing(Employee1::getAge)
                                .thenComparing(Employee1::getName)
                )
                .collect(Collectors.toList());

        result.forEach(e ->
                System.out.println(e.getName() + " " + e.getAge() + " " + e.getSalary())
        );
    }
}
