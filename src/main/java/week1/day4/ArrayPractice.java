package week1.day4;

import java.util.Random;

public class ArrayPractice {

    public static void main(String[] args) {
        int[] lotto = new int[7];
        Random shuffle = new Random();

        for (int i = 0; i < lotto.length; i++) {
            int num = shuffle.nextInt(45) + 1;
            boolean duplicate = false;

            // 중복 검사
            for (int j = 0; j < i; j++) {
                if (lotto[j] == num) {
                    duplicate = true;
                    i--;
                    break;
                }
            }
            if (!duplicate) {
                lotto[i] = num;
            }
        }
        System.out.println("로또 번호: ");
        for (int i = 0; i < lotto.length; i++) {
            System.out.print(lotto[i]);
            if (i < lotto.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
