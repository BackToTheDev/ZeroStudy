package week7.day5;
import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Arr5 {
    public static void main(String[] args) throws IOException{
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        System.out.println(Arrays.toString(arr));

        int[] newArr = new int[arr.length + 1];
        for(int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        System.out.println(Arrays.toString(newArr));




    }
}
