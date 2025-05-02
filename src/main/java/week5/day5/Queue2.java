package week5.day5;

public class Queue2 {

    public static class MyQueue2 {
        private int[] arr;
        private int front;
        private int rear;

        public MyQueue2() {
            this.arr = new int[5];
            this.front = 0;
            this.rear = 0;
        }

        public void enqueue(int value) {
            if ((rear + 1) % arr.length == front) {
                System.out.println("큐가 가득찼습니다..");
                return;
            }
            arr[rear] = value;
            rear = (rear + 1) % arr.length;
        }

        public void dequeue() {
            if (rear == front) {
                System.out.println("큐가 비어있습니다.");
                return;
            }
            front = (front + 1) % arr.length;
        }

        public int peek() {
            if (rear == front) {
                System.out.println("큐가 비어있습니다.");
                return -1;
            }
            return arr[front];
        }

        public void printQueue() {
            StringBuffer sb = new StringBuffer();


           while(front != rear) {
               sb.append(arr[front]).append(" ");
               front = (front + 1) % arr.length;
           }
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        MyQueue2 queue = new MyQueue2();

        System.out.println(queue.peek());

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.printQueue();

        System.out.println(queue.peek());

        queue.dequeue();
        queue.dequeue();

        queue.enqueue(40);

        queue.printQueue();
        System.out.println(queue.peek());





    }
}
