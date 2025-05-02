package week5.day4;
import java.util.*;
import java.io.*;

public class Queue1 {

    public static class Queue {
        private int[] arr;
        private int front, rear, size;

        public Queue() {
            this.arr = new int[10];
            front = 0;
            rear = -1;
            size = 0;
        }

        public void enqueue(int value) {
            if (size == arr.length) return;
            rear = (rear + 1) % arr.length;
            arr[rear] = value;
            size++;
        }

        public void dequeue() {
            if (size == 0) return;
            front = (front + 1) % arr.length;
            size--;
        }

        public int peek() {
            return arr[front % arr.length];
        }

        public void printQueue() {
            StringBuffer sb = new StringBuffer();
            for (int data : arr) {
                sb.append(data).append(" ");
            }
            System.out.println(sb.toString());
        }

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue queue = new Queue();
        for (int i = 1; i <= 10; i++) {
            queue.enqueue(10 * i);
        }
        queue.printQueue();
        queue.enqueue(200);
        queue.printQueue();

        System.out.println(queue.peek());


        for (int i = 1; i <= 10; i++) {
            queue.dequeue();
            System.out.println(queue.peek());
            queue.printQueue();
        }
    }
}
