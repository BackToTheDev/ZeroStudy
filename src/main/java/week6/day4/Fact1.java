package week6.day4;

import java.io.IOException;

public class Fact1 {

    public static int factorialRecursive(int n) {
        if (n == 0) return 1;
        return n * factorialRecursive(n - 1);
    }

    public static int factorialFor(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }


    public static void main(String[] args) throws IOException{
        System.out.println(factorialFor(5));
        System.out.println(factorialRecursive(5));

    }
}
