package week4.day3.functionalInterface.thread;

public class RunnablePrintThreadExample {
    public static void main(String[] args) {
        Runnable task = () -> System.out.println("[" + Thread.currentThread().getName() + "]" + "Runnable Thread");

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("[" + Thread.currentThread().getName() + "] Hello Wolrd!");

        Thread thread2 = new Thread(task);
        thread2.start();

        Thread thread3 = new Thread(task);
        thread3.start();
    }
}
