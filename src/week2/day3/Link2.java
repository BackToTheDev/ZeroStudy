package week2.day3;

import java.util.LinkedList;
import java.util.Scanner;

public class Link2 {

    public static void main(String[] args) {
        LinkedList<String> stay = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 대기 줄 등록 (5명) ===");
        for (int i = 1; stay.size() < 5; i++) {
            System.out.print(i + "번째 사람 이름: ");
            stay.add(scanner.nextLine());
        }

        stay.remove("김철수");
        stay.addFirst("김철수");
        System.out.println("김철수님이 먼저 가야 할 사정이 있어 맨 앞으로 이동합니다.");
        System.out.println("최종 대기 줄은 다음과 같습니다: ");
        System.out.println(stay);


    }
}
