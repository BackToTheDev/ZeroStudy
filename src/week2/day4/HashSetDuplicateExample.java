package week2.day4;

import java.util.HashSet;

public class HashSetDuplicateExample {

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        System.out.println(set);

        set.remove("A");
        set.remove("C");
        System.out.println(set);

        set.add("B");
        System.out.println(set);

    }
}
