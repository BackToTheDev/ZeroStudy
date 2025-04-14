//BE 36_권준성

package week3.day1;

import java.util.Scanner;

class Bank {
    int amount = 10000;

    public int getAmount() {
        return amount;
    }

    public int withdraw(int withdraw) throws Exception{
        if (amount < withdraw) {
            throw new Exception("잔액 부족!");
        }
         return amount -= withdraw;

    }
}

public class ExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("> Task :ATMSystem.main()");
        System.out.print("출금할 금액 입력: ");

        try {
            bank.withdraw(scanner.nextInt());
            System.out.println("출금 완료! 남은 잔액: " + bank.getAmount());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("거래 기록이 저장되었습니다.");
        }

    }
}
