package week7.day5;
import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Arr4 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int inputData = Integer.parseInt(br.readLine());
        int[] arr = new int[inputData];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            inputData = Integer.parseInt(br.readLine());
            arr[i] = inputData;
            sum += arr[i];
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        double avg = (double) sum / arr.length;

        StringBuffer sb = new StringBuffer();
        sb.append(sum).append("\n").append(String.format("%.2f", avg)).append("\n").append(min).append("\n").append(max);
        System.out.println(sb.toString());

    }
}
