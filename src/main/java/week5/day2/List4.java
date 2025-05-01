package week5.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;
import java.io.*;

public class List4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputData = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < inputData.length; i++) {
            list.add(Integer.parseInt(inputData[i]));
        }


        inputData = br.readLine().split(" ");
        int index = Integer.parseInt(inputData[0]);
        int value = Integer.parseInt(inputData[1]);

        list.add(index, value);

        StringBuffer sb = new StringBuffer();
        for (int data : list) {
            sb.append(data).append(" ");
        }
        System.out.println(sb.toString());
    }
}

