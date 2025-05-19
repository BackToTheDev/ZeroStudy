package week7.day5;
import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Arr6 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[1];
        int index = 0;

        while (true) {

            if (arr.length == index) {
                int[] newArr = new int[arr.length + 1];
                for (int i = 0; i < arr.length; i++) {
                    newArr[i] = arr[i];
                }
                arr = newArr;
            }
            int value = Integer.parseInt(br.readLine());

            arr[index] = value;
            index++;
            System.out.println(Arrays.toString(arr));
        }

    }
}
