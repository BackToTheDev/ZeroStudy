package week2.day3;

import java.util.ArrayList;

public class ArrList1 {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("banana");
        System.out.println(fruits);

        System.out.println(fruits.get(0));

        fruits.remove(0);

        System.out.println(fruits.size());
        System.out.println(fruits.get(0));
    }
}
