package week2.day3;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrList3 {

    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 좋아하는 음식 5가지를 입력하세요 ===");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "번째 음식: ");
            food.add(scanner.nextLine());
        }
        System.out.println("당신이 입력한 음식 리스트는 다음과 같습니다: ");
        System.out.println(food);
        System.out.println();

        try {
            System.out.print("확인하고 싶은 음식의 인덱스를 입력하세요: ");
            int index = scanner.nextInt();
            String what = food.get(index - 1);
            System.out.println(index + "번 인덱스의 음식은 '" + what + "'입니다.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("인덱스 범위를 벗어났습니다. 다시 시도해주세요!");
        }

    }
}
