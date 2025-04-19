//BE 36_권준성
package week3.day5;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class AsyncPaymentProcessor {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        CompletableFuture<Integer> paymentFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println("결제 요청 중... (50000원)");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("결제 실패: null" );
            }
            return 50000;
        }, executor);

        try {
            int result = paymentFuture.get(3, TimeUnit.SECONDS);
            System.out.println("결제 완료: " + result + "원");
        } catch (Exception e) {
            System.out.println("결제 실패 : " + e.getMessage());
        } finally {
            executor.shutdown();
        }

    }
}
