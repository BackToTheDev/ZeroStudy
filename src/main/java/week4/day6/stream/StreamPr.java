package week4.day6.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamPr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 (공백 또는 스페이스로 구분)");
        String input = scanner.nextLine();

        List<Integer> numbers = Arrays.stream(input.split("[,\\s]+"))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 == 1)
                .collect(Collectors.toList());

        System.out.println(evenNumbers);
        System.out.println(oddNumbers);
    }
}
