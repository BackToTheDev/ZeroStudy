package week8.day1;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) return new int[]{-1};

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != min) list.add(arr[i]);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
