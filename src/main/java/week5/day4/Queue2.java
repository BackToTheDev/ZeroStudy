package week5.day4;
import java.util.*;
import java.io.*;

public class Queue2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputData = br.readLine().split(" ");
        int N = Integer.parseInt(inputData[0]);
        int M = Integer.parseInt(inputData[1]);

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }

            StringBuffer sb = new StringBuffer();
            while (!queue.isEmpty()) {
                sb.append(queue.poll()).append(" ");

                if (queue.isEmpty()) break;

                for (int m = 1; m < M; m++) {
                    queue.offer(queue.poll());
                }
            }

            System.out.println(sb.toString());
        }

    }

