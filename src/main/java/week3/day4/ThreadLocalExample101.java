package week3.day4;

public class ThreadLocalExample101 {
    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);

    public static void main(String[] args) {
        Runnable task = () -> {
            threadLocal.set((int) (Math.random() * 1000));
            System.out.println(Thread.currentThread().getName() + " - value: " + threadLocal.get());
            threadLocal.remove();
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.run();
        thread2.start();
        thread3.start();
    }
}
