// BE 36_권준성
package week3.day5;

import java.util.stream.LongStream;

public class ParallelStreamSumExample {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
        long streamNum = LongStream.rangeClosed(1, 500_000_000)
                .sum();
        long end = System.currentTimeMillis();
        System.out.println("순차 스트림 합계: " + streamNum + " (시간: " + (end - start) + "ms)");

        start = System.currentTimeMillis();
        long parallelStreamNum = LongStream.rangeClosed(1, 500_000_000)
                .parallel()
                .sum();
        end = System.currentTimeMillis();
        System.out.println("병렬 스트림 합계: " + parallelStreamNum + " (시간: " + (end - start) + "ms)");
    }
}
