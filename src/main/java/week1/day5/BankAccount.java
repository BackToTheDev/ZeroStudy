package week1.day5;

abstract class BankAccount {

    private String accountNumber; // 계좌번호
    private String owner; // 예금주
    protected int balance; // 잔액
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
        }
    }


    // 2. 출금 (추상 메서드로 변경 -> 계좌 종류별로 구현을 다르게 하기 위함)
    abstract boolean withdrawal(int amount);

    // 3. 잔액 조회
    public void check() {
        System.out.println("남은 잔액은 " + balance + "원 입니다.");
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        // 1. 계좌 생성
        NormalAccount normal = new NormalAccount("1111-2222", "홍길동");
        // 마이너스 통장 개설 (한도 10만원)
        MinusAccount minus = new MinusAccount("3333-4444", "김철수", 100000);

        // 입금
        normal.deposit(50000);
        minus.deposit(50000);

        System.out.println("=== 일반 계좌 출금 ===");
        System.out.println("현재 잔액 : " + normal.getBalance());
        //7만원 출금
        if (normal.withdrawal(70000)) {
            System.out.println("출금 성공!");
        } else {
            System.out.println("출금 실패!");
        }

        System.out.println("=== 마이너스 계좌 출금 ===");
        System.out.println("현재 잔액 : " + minus.getBalance());

        if (minus.withdrawal(70000)) {
            System.out.println("출금 성공!");
            System.out.println("현재 잔액 : " + minus.getBalance());
        } else {
            System.out.println("출금 실패!");
        }
    }
}

class NormalAccount extends BankAccount {

    //일반 계좌
    public NormalAccount(String accountNumber, String owner) {
        super(accountNumber, owner);
    }

    @Override
    boolean withdrawal(int amount) {
        if (amount > 0 && balance > amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

// 마이너스 통장
class MinusAccount extends BankAccount {

    private int minusLimit;

    public MinusAccount(String accountNumber, String owner, int minusLimit) {
        super(accountNumber, owner);
        this.minusLimit = minusLimit;
    }

    @Override
    boolean withdrawal(int amount) {
        // 잔액 + 마이너스 한도액까지 출금 가능
        if (amount > 0 && balance + minusLimit >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
