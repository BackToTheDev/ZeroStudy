package week3.day1;

import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("메뉴 선택");
            System.out.println("1. 숫자 입력 | 2. 종료");
            System.out.print(">");
            String input = scanner.nextLine();
            switch (input) {
                case "1" :
                    System.out.print("숫자를 입력하세요: ");
                    try {
                        String numInput = scanner.nextLine();
                        Integer intNum = Integer.parseInt(numInput);
                        System.out.println(intNum);
                    } catch (NumberFormatException e) {
                        System.out.println("잘못된 입력입니다.");
                    }
                    break;
                case "2":
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }
}
