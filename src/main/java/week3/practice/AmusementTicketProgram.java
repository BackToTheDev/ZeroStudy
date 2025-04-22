//BE 36_권준성
package week3.practice;

import java.util.Scanner;

public class AmusementTicketProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[입장권 계산]");
        System.out.print("나이를 입력해 주세요.(숫자): ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("입장 시간을 입력해 주세요. (숫자 입력): ");
        int time = scanner.nextInt();
        scanner.nextLine();
        System.out.print("국가유공자 여부를 입력해 주세요.(y/n): ");
        String merit = scanner.nextLine();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n): ");
        String card = scanner.nextLine();


            if (age < 3) {
                System.out.println("입장료: 0원 (무료 대상입니다)");
            } else if (merit.equalsIgnoreCase("y") || card.equalsIgnoreCase("y")) {
                System.out.println("입장료: 8000원 (일반 할인 적용)");
            } else if (age < 13 || time >= 17) {
                System.out.println("입장료: 4000원 (특별 할인 적용)");
            } else {
                System.out.println("입장료: 10000원 입니다.");
            }
    }
    }


