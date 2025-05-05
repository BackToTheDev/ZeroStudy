package week6;
import java.util.*;
import java.io.*;

public class Bubble2 {

    public static void bubbleSort1(int[] arr) {
        int size = arr.length;
        boolean swapper;
        for (int i = 0; i < size - 1; i++) { // 횟수
           swapper = false;
            for (int j = 0; j < size - 1 - i; j++) {// 위치 체크
                int temp;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapper = true;
                }
            }
            if (!swapper) break;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputData = br.readLine().split(" ");
        int[] arr = new int[inputData.length];
        for(int i = 0; i < inputData.length; i++) {
            arr[i] = Integer.parseInt(inputData[i]);
        }


        System.out.println("변환 전 : " + Arrays.toString(arr));
        bubbleSort1(arr);
        System.out.println("변환 후 : " + Arrays.toString(arr));

    }
}
