package week1.day3;

public class ForExample {

    public static void main(String[] args) {
        // 1. 구구단의 2단을 출력
        for (int i = 1; i <= 9; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
        }

        // 2. 합계 구하기
        // 1+2+3+4+5+6+7+8+9+10
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println(sum);

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
        }

        // 1부터 100까지 반복을 사용해서 합을 구하기
//        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
