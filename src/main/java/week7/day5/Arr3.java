package week7.day5;
import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Arr3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputData = br.readLine().split(" ");

        if (inputData.length != 10) {
            System.out.println("10개를 입력하세요.");
            return;
        }

        int[] arr = new int[inputData.length];

        int sum = 0;
        for (int i = 0; i < inputData.length; i++) {
                arr[i] = Integer.parseInt(inputData[i]);
                sum += arr[i];
            }


        int min = Integer.MAX_VALUE;

        for (int i = 0; i < inputData.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
            }
        }

        StringBuffer sb = new StringBuffer();
        sb.append(sum).append("\n").append(min);
        System.out.println(sb.toString());
    }
}
