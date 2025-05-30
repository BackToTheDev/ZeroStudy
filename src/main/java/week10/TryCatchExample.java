package week10;

public class TryCatchExample {
    public static void main(String[] args) {
        try {
            double result = 10 / 0;
            System.out.println("결과: " + result);
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        } catch (ArithmeticException e){
            System.out.println("에러 메시지: " + e.getMessage());
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
