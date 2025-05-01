package week5.day3;
import java.util.*;
import java.io.*;

public class Stack3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputData = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (char ch : inputData.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else { // ch == '('
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            }
        }
        System.out.println(stack.isEmpty());
    }
}
