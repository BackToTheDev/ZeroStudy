package week2.day3;

import java.util.LinkedList;

public class Link1 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        //출력
        System.out.println(list);

        // 데이터 접근(인덱스 사용)
        System.out.println(list.get(0));

        //요소 삭제
        list.remove("Banana");
        System.out.println("삭제 후 리스트 : " + list);

        // 리스트 크기 확인
        System.out.println("리스트 크기 : " + list.size());
    }
}
