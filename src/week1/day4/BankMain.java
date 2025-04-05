package week1.day4;

public class BankMain {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("1541-51", "권준성");
        bankAccount.deposit(15000);
        bankAccount.withdrawal(3000);
        bankAccount.check();
        System.out.println(bankAccount.getOwner());
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getTotalAccounts());
    }
}
