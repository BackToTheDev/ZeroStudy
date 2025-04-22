package week3.day4;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ScheduledThreadPoolExample {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newScheduledThreadPool(1);

        executor.execute(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("[ " + LocalDateTime.now() + " ] " + "이메일 발송: 1 (" + Thread.currentThread().getName() + ")");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 1; i < 1000000; i++) {
                try {
                    Thread.sleep(10000);
                    System.out.println("[ " + LocalDateTime.now() + " ] " + "이메일 발송: 1 (" + Thread.currentThread().getName() + ")");
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        executor.shutdown();
    }
}
