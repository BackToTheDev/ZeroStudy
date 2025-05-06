package week6.day2;
import java.util.*;
import java.io.*;

public class Select2 {

    public static void selectionSort(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            int minValue = i;

            for (int j = i + 1; j < size; j++) {
                if (arr[minValue] > arr[j]) {
                    minValue = j;
                }
            }
            int temp = arr[minValue];
            arr[minValue] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] main) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputData = br.readLine().split(" ");
        int[] arr = new int[inputData.length];

        for (int i = 0; i < inputData.length; i++) {
            arr[i] = Integer.parseInt(inputData[i]);
        }

        System.out.println("정렬 전 : " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("정렬 후 : " + Arrays.toString(arr));
    }
}
