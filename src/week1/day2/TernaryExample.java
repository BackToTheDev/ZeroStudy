package week1.day2;

public class TernaryExample {
    public static void main(String[] args) {

        // 삼항 연산자
        // 1. 합격/불합격 판단
        int score = 85;
        String result = score >= 60 ? "합격" : "불합격";
        System.out.println("합격 유무 = " + result);

        // 2. 짝수/홀수 판단
        int num = 6;
        String evenOdd = num % 2 == 0 ? "짝수" : "홀수";
        System.out.println("짝수/홀수 = " + evenOdd);

        // 3. 더 큰 수 찾기
        int a = 10, b = 20;
        int bigger = a > b ? a : b;
        System.out.println("더 큰 수 = " + bigger);

        // 4. 할인 적용
        int price = 10000;
        boolean isMember = true;
        int finalPrice = isMember ? price - 1000 : price;
        System.out.println("회원 할인 가격 : " + finalPrice);
    }
}
