package week5.day1;
import java.util.*;
import java.util.stream.*;

public class arrayMain {
    public static void main(String[] args) {
        int[] arr = new int[5]; //사이즈를 명확하게 지정
//        double[] doArr = new double[4];
//        char[] charArr = new char[3];
//        String[] strArr = new String[4];

        int[] arr2 = {10, 20, 30}; // 사이즈 3짜리, 배열
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = new int[5];
        for(int i = 0; i < arr3.length; i++) {
            Random rand = new Random();
            arr3[i] = rand.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(arr3));

        int[] arr4 = new int[5];
        Arrays.fill(arr4, 10);
        System.out.println(Arrays.toString(arr4));

        int[] arr5 = IntStream.range(0, 5).toArray();
        System.out.println(Arrays.toString(arr5));

//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(charArr));
//        System.out.println(Arrays.toString(strArr));
//        System.out.println(Arrays.toString(doArr));



    }
}
