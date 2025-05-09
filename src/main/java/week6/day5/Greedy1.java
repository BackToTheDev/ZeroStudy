package week6.day5;
import java.util.*;
import java.io.*;

public class Greedy1 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int amount = Integer.parseInt(br.readLine());

        int[] coins = {500, 100, 50, 10};
        int count = 0;

        for (int coin : coins)  {
            count += amount / coin;
            amount = amount % coin;
        }

        System.out.println(count);

    }
}
