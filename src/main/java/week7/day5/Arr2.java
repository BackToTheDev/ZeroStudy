package week7.day5;
import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Arr2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();

        String inputData = br.readLine();
        int[] arr = new int[Integer.parseInt(inputData)];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(11);
        }

        System.out.println(Arrays.toString(arr));

        inputData = br.readLine();
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == Integer.parseInt(inputData)) {
                count++;
            }
        }

        System.out.println(count);


    }
}
