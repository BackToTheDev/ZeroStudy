package week5.day6;
import java.util.*;
import java.io.*;


public class Queue1 {
    public static class MyQueue1 {
        private int[] arr;
        private int front;
        private int rear;

        public MyQueue1() {
            this.arr = new int[5];
            this.front = 0;
            this.rear = 0;
        }

        public void enqueue(int value) {
            if ((rear + 1) % arr.length == front) {
                System.out.println("큐가 가득찼습니다.");
                return;
            }
            rear = (rear + 1) % arr.length;
            arr[rear] = value;
        }

        public int dequeue() {
            if (rear == front) {
                System.out.println("큐가 비었습니다.");
                return -1;
            }
            front = (front + 1) % arr.length;
            return arr[front];
        }

        public int peek() {
            if (rear == front) {
                System.out.println("큐가 비었습니다.");
                return -1;
            }
            return arr[(front + 1) % arr.length];
        }

        public void printQueue() {
            StringBuffer sb = new StringBuffer();
            if (rear == front) {
                System.out.println("큐가 비어 있습니다.");
                return;
            }

            int i = (front + 1) % arr.length;
            while (i != (rear + 1) % arr.length) {
                sb.append(arr[i]).append(" ");
                i = (i + 1) % arr.length;
            }
            System.out.println(sb.toString());
        }

        public static void main(String[] main) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            MyQueue1 queue = new MyQueue1();

            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            queue.enqueue(40);
            queue.enqueue(50);
            queue.printQueue();

            queue.dequeue();
            queue.dequeue();

            queue.printQueue();

            System.out.println(queue.peek());


        }
    }
}
