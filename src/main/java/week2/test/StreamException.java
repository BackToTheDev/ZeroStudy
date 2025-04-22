//BE 36_권준성
package week2.test;

import java.util.Scanner;

public class StreamException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = scanner.nextLine();

        System.out.print("학년 : ");
        int grade = scanner.nextInt();
        scanner.nextLine();

        System.out.print("반 : ");
        String clazz = scanner.nextLine();

        System.out.println("=== 학생 정보 ===");
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
        System.out.println("반 : " + clazz);
    }
}
