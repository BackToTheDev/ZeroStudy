package week5.day1;
import java.util.*;
import java.io.*;

public class arr4 {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // 기준점 : 어떨때, 데이터를 (배열을) 확장해야할까?
        // 배열의 index의 위치가 초과되었을 때를 확인해 확장한다. (배열의 size가 index와 같아지는 순간이 데이터의 배열을 확장해야하는 순간)

        int[] arr = new int[1];
        int index = 0;

        while(true) {
            int value = Integer.parseInt(bufferedReader.readLine());

            if (index == arr.length) {
                arr = expendArr(arr);

            }
            arr[index] = value;
            index++;
            System.out.println(Arrays.toString(arr));
        }
    }

    public static int[] expendArr(int[] originalArr) {
        // 확장하는 시점 : index가 범위를 막 초과한 경우
        int[] newArr = new int[originalArr.length + 1];
        for (int i = 0; i < originalArr.length; i++) {
            newArr[i] = originalArr[i];
        }
        originalArr = newArr;
    }
}
