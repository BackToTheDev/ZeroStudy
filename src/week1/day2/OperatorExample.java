package week1.day2;

public class OperatorExample {
    public static void main(String[] args) {
        // 1. 산술 연산자(사칙 연산)
        int a = 10 + 5;
        System.out.println("a = " + a);
        int b = 10 - 5;
        System.out.println("b = " + b);
        int c = 10 * 5;
        System.out.println("c = " + c);
        int d = 10 / 5;
        System.out.println("d = " + d);
        int e = 10 % 3;
        System.out.println("e = " + e);

        // 2. 대입 연산자
        int number = 10;
        String name = "홍길동";

        // 3. 증감 연산자
        int count = 1;
        count++;// count = count + 1;
        System.out.println("count = " + count);
        count--; // count = count - 1;
        System.out.println("count = " + count);

        // 4. 비교 연산자
        int x = 10;
        int y = 20;
        // x가 y보다 큰가?
        boolean aa = x > y;
        System.out.println("x가 y보다 큰가? : " + aa);

        // x가 y보다 작은가?
        boolean bb = x < y;
        System.out.println("x가 y보다 작은가 = " + bb);
        boolean cc = x == y;
        System.out.println("x가 y와 같은가 = " + cc);

        // 5. 논리 연산자
        boolean 비가온다 = true;
        boolean 춥다 = false;
        boolean andResult = 비가온다 && 춥다;
        boolean orResult = 비가온다 || 춥다;

        System.out.println("andResult = " + andResult);
        System.out.println("orResult = " + orResult);



    }
}
