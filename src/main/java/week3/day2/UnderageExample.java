// BE 36_권준성
package week3.day2;

import java.util.HashMap;
import java.util.Scanner;

class UnderageException extends Exception{

    public UnderageException(String message) {
        super(message);
    }
}

public class UnderageExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> user = new HashMap<>();

        while (true) {
            System.out.println("사용자 등록 시스템 (register, list, exit)");
            System.out.print("명령 입력: ");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                System.out.println("시스템 종료.");
                return;
            }

            if (input.equals("register")) {
                try {
                    System.out.print("이름 입력: ");
                    String name = scanner.nextLine();

                    System.out.print("나이 입력: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    if (age < 18) {
                        throw new UnderageException("미성년자는 등록할 수 없습니다.");
                    }
                    user.put(name, age);
                    System.out.println("사용자 등록 완료!");
                } catch (UnderageException e) {
                    System.out.println(e.getMessage());
                } catch (NumberFormatException e) {
                    System.out.println("나이는 숫자로 입력하세요.");
                }

            } else if (input.equals("list")) {
                System.out.println("등록된 사용자 목록");
                for (String name : user.keySet()) {
                    System.out.println(name + " (나이: " + user.get(name) + ")");
                }
            }
        }
    }
}
