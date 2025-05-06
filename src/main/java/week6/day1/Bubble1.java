package week6.day1;
import java.util.*;
import java.io.*;

public class Bubble1 {

    public static void bubbleSort(int[] arr) {
        int size = arr.length;
        boolean swapped;

        for (int i = 0; i < size - 1; i++) { // i는 개수 확인
            swapped = false;
            for (int j = 0; j < size - 1 - i; j++) { // j가 실질 인덱스 확인
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // 더이상 정렬하지 않고 종료합니다.
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
        bubbleSort(arr);
        System.out.println("정렬 후 : " + Arrays.toString(arr));
    }

}
