package week5.day3;
import java.util.*;
import java.io.*;

public class Stack2 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputData = br.readLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < inputData.length(); i++) {
            stack.push(inputData.charAt(i));
        }
        System.out.println(stack.toString());

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());

    }
}
