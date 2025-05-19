import java.util.*;
import java.io.*;

public class MaxArr {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            String inputData = br.readLine();
            arr[i] = Integer.parseInt(inputData);
        }

        int max = Integer.MIN_VALUE;
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
               count = i;

            }
        }
        System.out.println(max);
        System.out.println(count + 1);

    }
}
