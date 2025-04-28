package week5.day1;
import java.util.*;
import java.io.*;

public class Arr2 {
    public static void main(String[] args) throws IOException{
        // 1. 10개의 값을 입력받는다.
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); //Buffer로 들어오는 input은 모두 String이다.
        int[] arr = new int[10];

        int sum = 0;
        int minValue = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(buffer.readLine());
            sum += arr[i];
            if (arr[i] <= minValue) {
                minValue = arr[i];
            }
        }

        // 2. 총합을 구한다.

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(sum).append("\n").append(minValue);
        System.out.println(stringBuffer.toString());
//        System.out.println(sum);
//        System.out.println(minValue);



    }
}
