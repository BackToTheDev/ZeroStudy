// BE 36_권준성
package week2.test;

import java.util.HashSet;
import java.util.Scanner;


public class HashSetExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> id = new HashSet<>();


        while (true) {
            System.out.println("회원 관리 시스템 (add, remove, list, check, exit)");
            System.out.print("명령 입력: ");
            String select = scanner.nextLine();
            switch (select) {
                case "add":
                    System.out.print("추가할 회원 ID: ");
                    id.add(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println("회원이 추가되었습니다.");
                    break;

                case "list":
                    for (Integer list : id) {
                        System.out.println(list);
                    }
                        break;

                case "check":
                    System.out.print("검색할 회원: ");
                    int checkId = scanner.nextInt();
                    scanner.nextLine();
                    if (id.contains(checkId)) {
                        System.out.println("회원이 존재합니다.");
                    } else {
                        System.out.println("회원이 존재하지 않습니다.");
                    }
                    break;


                case "remove":
                    System.out.print("삭제할 회원 Id: ");
                    int removeId = scanner.nextInt();
                    scanner.nextLine();
                    if (id.contains(removeId)) {
                        id.remove(removeId);
                        System.out.println("삭제 완료");
                    } else {
                        System.out.println("없는 회원");
                    }
                    break;

                case "exit":
                    return;

            }
        }
    }
}
