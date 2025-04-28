package week5.day1;
import java.util.*;
import java.io.*;

public class Arr1 {
    public static void main(String[] args) throws IOException {
        // 사용자에게 입력(input)을 받는다
        // 결과를 출력(output)한다.
        // > IO(Input / Output)
        // 오류의 가능성을 갖고있다.

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        // 1. 사용자에게 배열의 크기를 입력받는다.
        System.out.print("배열의 크기를 입력해주세요: ");
        int size = Integer.parseInt(buffer.readLine());

        int[] arr = new int[size];

        // 2. 랜덤하게 배열을 초기화한다.
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));

        // 3. 사용자에게 특정 숫자를 입력받는다.
        System.out.print("찾을 숫자를 입력해주세요: ");
        int findNumber = Integer.parseInt(buffer.readLine());

        // 4. 개수를 세어 출력한다.
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == findNumber) count++;
            if (arr[i] != findNumber) continue;
            count++;
        }
        System.out.println(count);
    }
}
