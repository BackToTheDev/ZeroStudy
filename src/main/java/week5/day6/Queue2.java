package week5.day6;
import java.util.*;
import java.io.*;

public class Queue2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);

        while (queue.size() > 1) {
            queue.poll();
            int exitNumber = queue.poll();
            queue.offer(exitNumber);
        }
        System.out.println(queue.peek());

    }
}
