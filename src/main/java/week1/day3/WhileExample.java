package week1.day3;

public class WhileExample {

    public static void main(String[] args) {
//        int num = 1;
//        while (num <= 5) {
//            System.out.println(num);
//            num++;
//        }

        // 2. 카운트 다운
//        int count = 5;
//        while (count > 0) {
//            System.out.println(count);
//            count--;
//        }
//        System.out.println("발사!");

        // 3. 무한 루프
//        int num = 1;
//        while (true) {
//            System.out.println("무한 반복 !! 위험함. 횟수 : " + num);
//            num++;
//        }

        // break, continue
        //break
//        int sum = 0;
//        int num = 1;
//        while (true) {
//            sum += num;
//            if (sum > 100) {
//                break;
//            }
//            System.out.println(sum);
//            num++;
//        }

        //continue
        int number = 0;
        while (number < 10) {
            number++;
            if (number % 2 != 0) { // 홀수
                continue;
            }
            System.out.println(number); // 짝수
        }
    }



}
