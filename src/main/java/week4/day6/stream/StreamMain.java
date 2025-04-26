// Be 36_권준성

package week4.day6.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요 (공백 또는 쉼표로 구분):");
        String input = scanner.nextLine();
        List<Integer> numbers = Arrays.stream(input.split("[,\\s]+"))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 == 1)
                .collect(Collectors.toList());

       List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

       int sum = numbers.stream()
               .mapToInt(Integer::intValue)
               .sum();

       double avg = numbers.stream().mapToInt(Integer::intValue)
               .average().orElse(0);

       int max = numbers.stream()
                       .mapToInt(Integer::intValue)
                               .max().orElse(0);

       int min = numbers.stream()
                       .mapToInt(Integer::intValue)
                               .min().orElse(0);

       List<Integer> delete = numbers.stream().distinct().sorted()
                       .collect(Collectors.toList());

        System.out.println("입력된 숫자: " + numbers);
        System.out.println("합계: " + sum);
        System.out.printf("평균: %.2f%n", avg);
        System.out.println("홀수: " + oddNumbers);
        System.out.println("짝수: " + evenNumbers);
        System.out.println("최댓값: " + max);
        System.out.println("최소값: " + min);
        System.out.println("중복 제거 후 정렬된 숫자: " + delete);
    }
}
