// BE 36_권준성

package week3.day4;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExample1 {
    public static void main(String[] args) {
        ScheduledExecutorService schedule = Executors.newScheduledThreadPool(1);
        schedule.scheduleAtFixedRate(() -> {
            System.out.println("[" + LocalDateTime.now() + " ] " + "이메일 발송: 1 (" + Thread.currentThread().getName() + ")");
        }, 5, 10, TimeUnit.SECONDS);

    }
}
