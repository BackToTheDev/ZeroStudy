package week1.day4;

public class BankAccount {

    private String accountNumber; // 계좌번호
    private String owner; // 예금주
    private int balance; // 잔액
    private static int totalAccounts; // 전체 계좌 수

    // 생성자
    public BankAccount(String accountNumber, String owner) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = 0;
        totalAccounts++;
    }

    // 메서드
    // 1. 입금
    public void deposit(int deposit) {
        if (deposit > 0) {
            balance += deposit;
            System.out.println(deposit + "원이 입금되었습니다.");
            System.out.println("남은 잔액은 " + balance + "원 입니다.");
        } else {
            System.out.println("잘못된 입력입니다.");
        }
    }


    // 2. 출금
    public void withdrawal(int withdrawal) {
        if (withdrawal > 0 && balance > withdrawal) {
            balance -= withdrawal;
            System.out.println(withdrawal + "원이 출금되었습니다.");
            System.out.println("남은 잔액은 " + balance + "원 입니다.");
        } else {
            System.out.println("잔액이 부족합니다.");
        }
    }


    // 3. 잔액 조회
    public void check() {
        System.out.println("남은 잔액은 " + balance + "원 입니다.");
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getTotalAccounts() {
        return totalAccounts;
    }


}
