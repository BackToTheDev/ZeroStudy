package week6.day4;

import java.io.IOException;

public class BinarySelf1 {

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;


        while (left <= right) {
            int mid = (left + right) / 2;
            if (target == arr[mid]) {
               return mid;
            } else if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return - 1;
    }

    public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
        if (left > right) {
            return - 1;
        }

        int mid = (right + left) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearchRecursive(arr, target, left, mid - 1);
        } else {
            return binarySearchRecursive(arr, target, mid + 1, right);
        }
    }

    public static void main(String[] args) throws IOException{
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15};
        int target = 9;

        int index = binarySearch(arr, target);
        System.out.println("내가 찾는 값 : " + target + "의 위치는 " + (index == -1 ? "존재하지 않습니다." : index + "에 존재합니다."));
        System.out.println(binarySearchRecursive(arr, target, 0, (arr.length -1) ));
    }
}
