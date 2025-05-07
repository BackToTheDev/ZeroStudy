package week6.day3;
import java.util.*;
import java.io.*;

public class Binary1 {

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) { // left가 right보다 커지는 순간 찾고자 하는 값이 없다는 것
            int mid = (left + right) / 2;

            if (arr[mid] == target) { //찾으면 바로 반환
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
        String[] inputData = br.readLine().split(" "); // 정렬이 되어있는 입력이 보장되어있을 때
        int[] arr = new int[inputData.length];

        for (int i = 0; i < inputData.length; i++) {
            arr[i] = Integer.parseInt(inputData[i]);
        }

        // TODO : 정렬을 보장할 수 없다면, 정렬을 해주고 search 해야 한다.

        int target = Integer.parseInt(br.readLine());
        int index = binarySearch(arr, target); // -1이 오면 존재하지 않는다.
        System.out.println("찾고자 한 값 " + target + "의 위치는 " +
                (index == -1
                        ? "존재하지 않는다"
                        : (index + " 인덱스에 있다.")));

    }
}
