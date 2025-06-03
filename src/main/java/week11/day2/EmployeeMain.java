package week11.day2;
import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    int age;
    String department;

    public Employee (String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String ageDepartment() {
        return department;
    }
}

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("홍길동", 30, "HR"),
                new Employee("김철수", 27, "IT"),
                new Employee("이영희", 25, "IT"),
                new Employee("박민수", 35, "Sales"),
                new Employee("김동동", 34, "HR")
        );

        List<String> names = list.stream()
                .filter(employee -> employee.name.startsWith("김"))
                .sorted(Comparator.comparing(Employee::getAge).reversed())
                .map(Employee::getName)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
