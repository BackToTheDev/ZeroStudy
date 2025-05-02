package week5.day4;
import java.util.*;
import java.io.*;

public class Queue5 {
    public static class Queue {
        private LinkedList<Integer> list;


        public Queue() {
            list = new LinkedList<>();
        }

        public void enqueue(int value) {
            list.addLast(value);
        }

        public int dequeue() {
            if (list.isEmpty()) {
                System.out.println("큐가 비어있습니다.");
                return -1;
            }
            return list.removeFirst();
        }

        public int peek() {
            if (list.isEmpty()) {
                System.out.println("큐가 비어있습니다.");
                return -1;
            }
            return list.getFirst(); // list.get(0);
        }
    }

    public static void main(String[] args) {
        Queue4.Queue queue = new Queue4.Queue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue()); // 1 (제거되면서)
        System.out.println(queue.peek()); // 2 (확인만)
        queue.enqueue(4);
        System.out.println(queue.dequeue()); // 2 (제거)
        System.out.println(queue.dequeue()); //3
        System.out.println(queue.dequeue()); // 4
        System.out.println(queue.dequeue());
    }
}


