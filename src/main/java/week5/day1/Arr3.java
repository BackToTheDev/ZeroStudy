package week5.day1;
import java.util.*;
import java.io.*;

public class Arr3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(bufferedReader.readLine());
        int[] arr = new int[size];

        // 1. 개수 입력
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        // 2. 합 / 최소 / 최대
        int sum = 0;
        int maxValue = Integer.MIN_VALUE;
        int minValue = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }

            if (minValue > arr[i]) {
                minValue = arr[i];
            }
        }

        // 3. 평균
        double avg = (double) sum / size;

        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append(sum).append("\n").append(avg).append("\n").append(minValue).append("\n").append(maxValue);
        System.out.println(strBuffer.toString());


    }
}
