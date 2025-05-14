package week7.day2;
import java.util.*;
import java.io.*;

public class BossTimeCalculator {

    public static void main(String[] args) {
        int[] boss = {10, 8, 12, 5, 20};
        int[] skill = {0, 19, 5, 10, 3};

        List<Integer> order = new ArrayList<>();
        int N = boss.length;
        boolean[] visited = new boolean[N];

        permute(boss, skill, order, N, visited);
     }

     public static void permute(int[] boss, int[] skill, List<Integer> order, int N, boolean[] visited) {
        if(order.size() == N) {
            System.out.println(order); // List가 꽉차면 출력
            return;
        }

        for (int i = 0; i < N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                order.add(i);

                permute(boss, skill, order, N, visited);

                order.remove(order.size() - 1);
                visited[i] = false;
            }
        }
     }
}
