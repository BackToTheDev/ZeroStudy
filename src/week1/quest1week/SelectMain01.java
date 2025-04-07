package week1.quest1week;

import java.util.Scanner;

public class SelectMain01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SelectMain01 select01 = new SelectMain01();
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해 주세요.(금액):");
        int amount = scanner.nextInt();
        select01.cashBack(amount);


    }

    public void cashBack (int amount) {
        int cashBack =  (int) (amount * 0.1);
        cashBack = (cashBack / 100) * 100;
        if (cashBack >= 300) {
           cashBack = 300;
        }
        System.out.println("결제 금액은 " + amount + "원이고, 캐시백은 " + cashBack + "원 입니다.");
    }
}
