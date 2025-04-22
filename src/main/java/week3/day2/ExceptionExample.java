package week3.day2;

import java.util.Scanner;

class UserAgeException extends Exception{
    public UserAgeException(String message) {
        super(message);
    }
}

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("나이를 입력하세요 (exit): ");
            String input = scanner.nextLine().trim();

            if (input.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            try {
               int age = Integer.parseInt(input);
                if (age <= 0) {
                    throw new UserAgeException("나이가 너무 어립니다.");
                } else if (age >= 120) {
                    throw new UserAgeException("나이가 너무 많습니다.");
                }

                System.out.println("현재 나이는 " + age + "살 입니다.");

            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력해주세요.");
            } catch (UserAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
