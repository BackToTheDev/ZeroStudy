package week11.day5;
import java.util.*;
import java.util.stream.*;

class Purchase {
    String user;
    int amount;

    public Purchase(String user, int amount) {
        this.user = user;
        this.amount = amount;
    }

    public String getUser() {
        return user;
    }

    public int getAmount() {
        return amount;
    }
}

public class PurchaseMain {
    public static void main(String[] args) {
        List<Purchase> purchases = Arrays.asList(
                new Purchase("Alice", 5000),
                new Purchase("Bob", 3000),
                new Purchase("Alice", 6000),
                new Purchase("Charlie", 7000),
                new Purchase("Bob", 8000),
                new Purchase("Daisy", 2000)
        );

        List<String> names = purchases.stream().
                filter(p -> p.amount >= 10000)
                .map(Purchase::getUser)
                .collect(Collectors.toList());

        System.out.println(names);
    }
}
