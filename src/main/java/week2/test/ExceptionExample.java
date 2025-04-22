// BE 36_권준성
package week2.test;

public class ExceptionExample extends RuntimeException{

    public ExceptionExample(String message) {
        super(message);
    }
}

class Market {
    int amount = 1000;

    public void withdraw(int withdraw) throws ExceptionExample{
        if (withdraw > amount) {
            throw new ExceptionExample("잔액이 부족합니다. 현재 잔액 : " + amount + "원");
        }
        amount -= withdraw;
        System.out.println("출금 완료. 현재 잔액 : " + amount + "원");
    }
    }

    class main {
        public static void main(String[] args) {
            Market market = new Market();
            try {
                market.withdraw(2000);
            } catch (ExceptionExample e) {
                System.out.println("예외 발생: " + e.getMessage());
            }
        }
    }





