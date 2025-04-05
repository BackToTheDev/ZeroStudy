package week1.day2;

public class TypeExample {

    public static void main(String[] args) {
        // 1. 정수형 -> 실수형 형변환
        int number = 10;
        double doubleNumber = (double) number;
        System.out.println("1. 정수 -> 실수" );
        System.out.println("number = " + number);
        System.out.println("doubleNumber = " + doubleNumber);

        // 2. 실수형 -> 정수형 형변환
        double score = 93.7;
        int scoreInt = (int) score;
        System.out.println();
        System.out.println("2. 실수 -> 정수");
        System.out.println("score = " + score);
        System.out.println("scoreInt = " + scoreInt);

        // 3. 논리형
        boolean flag = true;
        System.out.println();
        System.out.println("논리형은 형변환 불가");
        System.out.println("flag = " + flag);

        //int boolToInt = (int) flag; // boolean을 형변환 하려면 에러 발생

        // 문제 : int -> char로 서로 형변환하면 어떻게 될까요?


        char ch = 'A';
        int chNum = (int) ch;
        System.out.println("4. 문자 -> 정수");
        System.out.println("ch = " + ch);
        System.out.println("chNum = " + chNum); // int를 char로 변환해서 출력하면 아스키코드에 해당하는 문자를 출력한다.

        int four = 66;
        char fourChar  = (char) four;
        System.out.println(fourChar); // 66이 나오는게 아니라 아스키코드 66번에 해당하는 B가 출력된다.
    }
}
