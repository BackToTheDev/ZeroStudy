package week2.day4;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Set2Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashSet<String> food = new LinkedHashSet<>();
        int i = 1;


        System.out.println("좋아하는 음식을 입력하세요 (중복X)");

        while (true) {

            System.out.print(i + "번째 음식: ");
            String input = scanner.nextLine();

            if (input.equals("그만")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            boolean isAdded = food.add(input);
            if (!isAdded) {
                System.out.println("[이미 입력된 음식입니다.]");
                continue;
            }
            i++;
        }
        System.out.println("입력한 음식 목록 (중복 제거) : ");
        System.out.println(food);
    }
}
