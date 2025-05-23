package week8.day3;
import java.util.*;
import java.io.*;

public class RecursionDP {
    static final int UND = -1;
    static List<Integer> memo;
    static final int max = 11;

    public static int f (int n) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (memo.get(n) != UND) {
            return memo.get(n);
        }
        memo.set(n, f(n - 1) + f(n - 2) + f (n - 3));
        return memo.get(n);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        memo = new ArrayList<>(Collections.nCopies(N + 1, UND));

        System.out.println(f(N));
    }

}
