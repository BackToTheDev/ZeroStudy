package week3.day4;



public class ThreadLocalExample102 implements Runnable{
    private int userId;

    public ThreadLocalExample102(int userId) {
        this.userId = userId;
    }

    @Override
    public void run() {
        threadLocal.set(userId);
        System.out.println(Thread.currentThread().getName() + ": " + threadLocal.get());
        threadLocal.remove();
    }

    private static ThreadLocal<Integer> threadLocal = ThreadLocal.withInitial(() -> 0);


    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadLocalExample102(101), "UserThread-1");
        Thread thread2 = new Thread(new ThreadLocalExample102(202), "UserThread-2");
        Thread thread3 = new Thread(new ThreadLocalExample102(303), "UserThread-3");
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
