package week5.day1;
import java.util.*;

public class Arr1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("데이터 크기를 입력하세요: ");

        int num = scanner.nextInt();
        int[] arr1 = new int[num];
        scanner.nextLine();
        for (int i = 0; i < arr1.length; i++) {
            Random rand = new Random();
            arr1[i] = rand.nextInt(11);
            int find = arr1.
        }
        System.out.println(Arrays.toString(arr1));

    }
}
