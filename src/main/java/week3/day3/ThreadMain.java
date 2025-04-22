package week3.day3;

 class MyThread100 extends Thread{
    public void run() {
        System.out.println("hello, thread(스레드: " + Thread.currentThread().getName() + ")");
    }
 }

 class MyThread200 implements Runnable {
     @Override
     public void run() {
         System.out.println("hello, thread (Runnable) (스레드: " + Thread.currentThread().getName() + ")");
     }
 }

 public class ThreadMain {
     public static void main(String[] args) {
         MyThread100 thread100 = new MyThread100();
         MyThread100 thread101 = new MyThread100();
         MyThread100 thread102 = new MyThread100();

         thread100.start();
         thread101.start();
         thread102.run();

         Thread thread200 = new Thread(new MyThread200());
         thread200.start();
     }
 }
