package week1.day2;

public class CastingExample {

    public static void main(String[] args) {
        // 1. 업캐스팅(작은 타입 -> 큰 타입)
        System.out.println("=== 업캐스팅 ===");
        int number = 10;
        double doubleNumber = number; // int -> double 자동 형변환
        System.out.println("int 값 : " + number);
        System.out.println("doubleNumber 값 : " + doubleNumber);

        // 2. 다운 캐스팅 (큰 타입 -> 작은 타입)
        System.out.println();
        System.out.println("=== 다운 캐스팅 ===");
        double score = 93.7;
        int scoreInt = (int) score;
        System.out.println("double = " + score);
        System.out.println("scoreInt = " + scoreInt);

        System.out.println();
        System.out.println("=== 데이터 손실 ===");
        double pi = 3.14;
        int intPi = (int) pi;
        System.out.println("double 값 = " + pi);
        System.out.println("int 값 = " + intPi);

        int a = 333;
        byte b = (byte) a;
        System.out.println("int = " + a);
        System.out.println("b = " + b);
    }
}
