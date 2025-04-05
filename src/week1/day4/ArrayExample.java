package week1.day4;

public class ArrayExample {
    public static void main(String[] args) {
        // 1. 배열
//        int[] scores = { 90, 80, 85, 95};

        // 2. 배열 선언과 생성
        // 배열 선언
//        int[] numbers;

        // 배열 생성
//        numbers = new int[5]; // 5개의 정수를 저장할 수 있는 배열 생성

        //선언과 생성을 동시에
        int[] ages = new int[3];

        // 선언과 동시에 초기화
        int[] points = {95, 88, 76, 91, 85};

        // 3. 배열의 사용
        int[] numbers = new int[5];

        // 값 저장
        numbers[0] = 10;
        numbers[1] = 20;

        // 값 읽기
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);

        // 배열의 길이
        System.out.println(numbers.length); //배열에 할당된 공간인 5를 출력

        // 배열은 반복문을 사용해 순회 가능
        int[] scores = { 90, 80, 85, 95};
//        for (int i = 0; i < scores.length; i++) {
//            System.out.println(scores[i]);
//        }

        //for-each 사용
        for (int score : scores) {
            System.out.println(score);
        }

        // 주의 사항
        int[] arr = new int[1];
//        arr[2] = 3;

//        int[] nullArr;
//        nullArr[0] = 1;



    }
}
