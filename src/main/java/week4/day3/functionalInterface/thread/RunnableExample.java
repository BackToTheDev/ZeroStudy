package week4.day3.functionalInterface.thread;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("Hello Wolrd!");

        Thread thread = new Thread(task);
        thread.start();
    }
}
