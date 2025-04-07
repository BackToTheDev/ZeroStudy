package week1.quest1week;

import java.time.LocalDate;
import java.util.Scanner;

//BE 36기_권준성
public class SelectMain03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[달력 출력 프로그램]");
        System.out.print("달력의 년도를 입력해 주세요.(yyyy): ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("달력의 월을 입력해 주세요.(mm): ");
        int month = scanner.nextInt();

        String mm = String.format("%02d", month);
        System.out.println("[" + year + "년 " + mm + "월]");


        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);


    }
}
