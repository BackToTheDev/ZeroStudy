package week6.day2;
import java.util.*;
import java.io.*;

public class Select1 {

    public static void selectionSort(int[] arr) { // 처음부터 끝까지 순회하고 하나 완료되면 그 다음부터 순회 이거 반복
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) { //
            int minIndex = i;

            for (int j = i + 1; j < size; j++) { //
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) throws IOException{
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
