package week7.day5;
import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Arr1 {
    public static void main(String[] args) throws IOException{
       int[] arr = new int[5];
       System.out.println(Arrays.toString(arr));

       Random rand = new Random();
       for (int i = 0; i < arr.length; i++) {
           arr[i] = rand.nextInt(9);
       }
       System.out.println(Arrays.toString(arr));

       int[] arr2 = new int[5];
       Arrays.fill(arr2, 10);
       System.out.println(Arrays.toString(arr2));

       int[] arr5 = IntStream.range(0, 5).toArray();
       System.out.println(Arrays.toString(arr5));
     }

}
