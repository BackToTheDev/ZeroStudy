package week1.quest1week;

import java.util.Random;
import java.util.Scanner;

//BE 36기_권준성
public class SelectMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(1000000);

        System.out.println("[주민등록번호 계산");
        System.out.print("출생년도를 입력해 주세요.(yyyy):");
        int year = scanner.nextInt();
        System.out.print("출생월을 입력해 주세요. (mm):");
        int month = scanner.nextInt();
        System.out.print("출생일을 입력해 주세요. (dd):");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.print("성별을 입력해 주세요.(m/f):");
        String gender = scanner.nextLine();

        String yy = String.format("%02d", year % 100);
        String mm = String.format("%02d", month);
        String dd = String.format("%02d", day);


            if (gender.equals("m")) {
                System.out.printf(yy + mm + dd + "-3"  + number);
        } else if (gender.equals("f")) {
                System.out.printf(yy + mm + dd + "-4"  + number);
            } else {
                System.out.println("잘못된 입력입니다.");
            }
    }

}
