package week5.day2;
import java.util.*;
import java.io.*;

public class List3 {
    public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] inputData = br.readLine().split(" ");

    int[] arr = new int[inputData.length];
    for(int i = 0; i < inputData.length; i++) {
        arr[i] = Integer.parseInt(inputData[i]);
    }
    System.out.println(Arrays.toString(arr));

    inputData = br.readLine().split(" ");
    int index = Integer.parseInt(inputData[0]);
    int value = Integer.parseInt(inputData[1]);

    int[] newArr = new int[arr.length + 1];

    for (int i = 0; i < index; i++) {
        newArr[i] = arr[i];
    }
    newArr[index] = value;

    for (int i = index + 1; i < newArr.length; i++) {
        newArr[i] = arr[i - 1];
    }
    arr = newArr;
    System.out.println(Arrays.toString(arr));

    }
}
