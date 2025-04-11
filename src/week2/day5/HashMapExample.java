package week2.day5;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "위너");
        map.put(2, "브라움");
        map.put(3, "조이");
        map.put(4, "스카너");

        System.out.println(map);

        map.remove(2);
        System.out.println(map);


        map.put(1, "이블린");
        System.out.println(map);

        System.out.println(map.get(3));

        map.clear();
        System.out.println(map);

    }
}
