package week1.day2;

public class ConcatExample {
    public static void main(String[] args) {
        // 문자열 연결
        // 1. 문자열끼리 합치기
        String hi = "안녕하세요" + " 반갑습니다.";
        System.out.println("인사 = " + hi);

        // 2. 문자열과 숫자 합치기
        String mySelf = "제 나이는 " + 20 + "살 입니다.";
        System.out.println("자기소개 = " + mySelf);

        // 3. 문자열과 정수 변수 합치기
        int age = 25;
        System.out.println("제 나이는 " + age + "살 입니다.");

        // 4. 문자열 + 숫자 계산
        int price = 1000;
        int count = 3;
        System.out.println("총 가격 : " + price * count + "원");
        
        // 주의사항
        // 숫자 + 숫자 + 문자열
        System.out.println(1 + 2 + "번");
        // 결과 : 3
        // 동작방식 : 먼저 1 + 2 = 3 계산 후 "번"과 합쳐짐

        //문자열 + 숫자 + 숫자
        System.out.println("번호" + 1 + 2);
        // 결과 : 번호12
        // 동작방식 : "번호"와 1을 먼저 합친 후 2를 합침

        //괄호 사용
        System.out.println("결과 : " + (1 + 2));
        System.out.println("결과 : " + 1 + 2);

        int amount = 10000;
        int food = 3500;
        int result = amount - food;
        System.out.println("결과 값 = " + result);
    }
}
