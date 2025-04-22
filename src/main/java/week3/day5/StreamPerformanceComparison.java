package week3.day5;

import java.util.stream.LongStream;

public class StreamPerformanceComparison {
    public static void main(String[] args) {

        //sequential
        long start = System.currentTimeMillis();
        long sumSequential = LongStream.rangeClosed(1, 100_000_000)
                .filter(n -> n % 2 == 0)
                .sum();
        long end = System.currentTimeMillis();
        System.out.println("sequential: " + sumSequential + ", time: " + (end-start) + "ms");

        start = System.currentTimeMillis();
        long sumParallel = LongStream.rangeClosed(1, 100_000_000)
                .filter(n -> n % 2 == 0)
                .parallel()
                .sum();
        end = System.currentTimeMillis();
        System.out.println("parallel: " + sumParallel + ", time: " + (end-start) + "ms");

    }
}
