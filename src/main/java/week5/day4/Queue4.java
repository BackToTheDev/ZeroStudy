package week5.day4;
import java.util.*;
import java.io.*;

public class Queue4 {

    public static class Queue {
        private Stack<Integer> saveStack;
        private Stack<Integer> likeQueue;

        public Queue() {
            this.saveStack = new Stack<>();
            this.likeQueue = new Stack<>();
        }

        public void enqueue(int value) {
            this.saveStack.push(value);
        }

        public int dequeue() {
            if (likeQueue.isEmpty() && saveStackToLikeQueue()) {
                // S -> L
                return -1;
            }
            return likeQueue.pop();
        }

        public int peek() {
            if(likeQueue.isEmpty() && saveStackToLikeQueue()) {
                // S -> L
                return -1;
            }
            return likeQueue.peek();
        }

        private boolean saveStackToLikeQueue() {
            if (saveStack.isEmpty()) {
                System.out.println("큐가 비어있습니다.");
                return false;
            }

            while(!saveStack.isEmpty()) {
                likeQueue.push(saveStack.pop());
            }
            return true;
        }

    }

    public static void main(String[] args) {
        Queue queue = new Queue();

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
