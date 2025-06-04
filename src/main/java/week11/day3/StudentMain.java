package week11.day3;
import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int score;
    String grade; // A, B, C

    public Student(String name, int score, String grade) {
        this.name = name;
        this.score = score;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getGrade() {
        return grade;
    }
}
public class StudentMain {
    public static void main(String[] args) {
        List<Student> student = Arrays.asList(
                new Student("지민", 85, "A"),
                new Student("태형", 92, "B"),
                new Student("정국", 90, "A"),
                new Student("석진", 88, "C"),
                new Student("남준", 95, "A")
        );

        List<String> Anames = student.stream()
                .filter(s -> s.grade.equals("A"))
                .sorted(Comparator.comparing(Student::getScore).reversed())
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println(Anames);
    }
}
