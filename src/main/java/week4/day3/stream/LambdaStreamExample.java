package week4.day3.stream;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaStreamExample {
    public static void main(String[] args) {
        List<String> students = List.of("자바 좋아요", "파이썬 최고", "자바 마스터", "C++ 어려워요");

        // Predicate 자바 포함 여부 필터
        Predicate<String> javaLover = name -> name.contains("자바");

        //이름을 대문자로 바꾸기
        Function<String, String> toUpperCase = String::toUpperCase;

        // Consumer 출력
        Consumer<String> print = System.out::println;

        students.stream()
                .filter(javaLover)
                .map(toUpperCase)
                .forEach(print);
    }
}
