package week5.day4;
import java.util.*;
import java.io.*;

public class Queue3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // N/M
        String[] inputData = br.readLine().split(" ");
        int N = Integer.parseInt(inputData[0]); // 1 ~ N
        int M = Integer.parseInt(inputData[1]); // M 이하의 값만 저장

        Queue<Integer> queue = new LinkedList<>();

        for (int num = 1; num <= N; num++) {
            queue.offer(num);
        }

        StringBuffer sb = new StringBuffer();

        int round = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            sb.append(round).append("(").append(queue.size()).append(") : ");

            for (int i = 0; i < size; i++) {
                int value = queue.poll();
                sb.append(value).append(" ");
                if (value * 10 > M) continue;
               queue.offer(value * 10);
            }

            round++;
            sb.append("\n");
        }

        System.out.println(sb.toString());


    }
}
