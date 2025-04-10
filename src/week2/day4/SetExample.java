package week2.day4;

import java.util.HashSet;
import java.util.Scanner;

public class SetExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> food = new HashSet<>();
        String fdName;


        System.out.println("좋아하는 음식 5가지를 입력하세요 (중복X)");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "번째 음식: ");
            String input = scanner.nextLine();
            boolean isAdded = food.add(input);
            if (!isAdded) {
                System.out.println("이미 입력된 음식입니다.");
                i--;
                continue;
            }
        }
        System.out.println("입력한 음식 목록 (중복 제거): ");
        System.out.print(food);
    }
}
