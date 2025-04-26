package week4.day5.list;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DrawProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        ArrayList<String> product = new ArrayList<>();

        while (true) {
            System.out.println("1. 상품 등록 | 2. 뽑기 | 3. 종료");
            System.out.print("> ");
            int input = scanner.nextInt();

            if (input == 3) {
                System.out.println("프로그램을 종료합니다.");
                return;
            } else if (input == 1) {
                String productInput = scanner.nextLine();
                System.out.println("상품을 입력하세요.");
                product.add(productInput);
            }


        }
    }
}
