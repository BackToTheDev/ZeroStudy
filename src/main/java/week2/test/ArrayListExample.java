// BE 36_권준성
package week2.test;

import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return name + " - " + phone;
    }
}

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contact> contact = new ArrayList<>();
        String select;

        while (true) {
            System.out.println("연락처 관리 시스템 (add, remove, list, search, exit)");
            System.out.print("명령 입력 : ");
            select = scanner.nextLine();

            switch (select) {
                case "add":
                    System.out.print("이름: ");
                    String name = scanner.nextLine();
                    System.out.print("전화번호: ");
                    String phone = scanner.nextLine();
                    contact.add(new Contact(name, phone));
                    System.out.println("연락처가 추가되었습니다.");
                    break;

                case "list":
                    for (Contact c : contact) {
                        System.out.println(c);
                    }
                    break;

                case "search":
                    System.out.print("검색할 이름: ");
                    String searchName = scanner.nextLine();
                    boolean found = false;
                    for (Contact c : contact) {
                        if (c.name.equals(searchName)) {
                            System.out.println(c);
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("연락처를 찾을 수 없습니다.");
                    }

                    break;

                case "remove":
                    System.out.print("삭제할 연락처 이름: ");
                    String removeName = scanner.nextLine();
                    boolean removed = contact.removeIf(c -> c.name.equals(removeName));
                    System.out.println(removed ? "삭제 완료!" : "연락처를 찾을 수 없습니다.");
                    break;

                case "exit":
                    return;

                default:
                    System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
