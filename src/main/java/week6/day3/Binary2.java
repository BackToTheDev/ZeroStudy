package week6.day3;
import java.util.*;
import java.io.*;

public class Binary2 {

    public static int binarySearch(int arr[], int target) {
        int left = 0, right = arr.length - 1;


        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputData = br.readLine().split(" ");
        int[] arr = new int[inputData.length];

        for (int i = 0; i < inputData.length; i++) {
            arr[i] = Integer.parseInt(inputData[i]);
        }

        int target = Integer.parseInt(br.readLine());
        int index = binarySearch(arr, target);

        System.out.println("찾고자 한 값 : " + target + "의 위치는 " + (index == -1 ? "존재하지 않는다." : index + "에 존재합니다."));
    }
}
