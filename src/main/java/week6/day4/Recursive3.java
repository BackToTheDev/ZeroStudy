package week6.day4;

import java.io.IOException;

public class Recursive3 {

    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    public static int fibonacciFor(int n) {
        if (n <= 1) return n;

        int prev = 0, current = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current; // 1 (1)
            current = next; // (2)
        }
        return current;
    }

    public static void main(String[] args) throws IOException{
        System.out.println(fibonacciFor(5));
        System.out.println(fibonacciRecursive(5));
    }
}
