package week5.day5;
import java.util.*;
import java.io.*;

public class Queue1 {

    public static class MyQueue {
        private int[] arr;
        private int front;
        private int rear;

        public MyQueue() {
            this.arr = new int[10];
            this.front = 0;
            this.rear = 0;
        }

        public void enqueue(int value) {
            if (rear == arr.length) {
                System.out.println("큐가 비었습니다.");
                return;
            }
            arr[rear++] = value;
        }

        public void dequeue() {
            if (front == rear) {
                System.out.println("큐가 비었습니다.");
                return;
            }
            front++;
        }

        public int peek() {
            if (front == rear) {
                System.out.println("큐가 비었습니다.");
                return -1;
            }

            return arr[front];
        }

        public void printQueue() {
            StringBuffer sb = new StringBuffer();

            for (int i = front; i < rear; i++) {
                sb.append(arr[i]).append(" ");
            }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        queue.printQueue();

        queue.dequeue();
        queue.dequeue();

        queue.printQueue();

        System.out.println(queue.peek());
    }
}
