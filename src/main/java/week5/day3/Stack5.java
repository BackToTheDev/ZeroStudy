package week5.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Stack5 { // 연산자의 우선순위 공평할때
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String inputData = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (char ch : inputData.toCharArray()) {
            if ('0' <= ch && ch <= '9') {
                sb.append(ch);
            } else { //연산자
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }

    private static int precedence(char ch) {
        if (ch == '+' || ch == '-') {
            return 0;
        }
        if (ch == '*' || ch == '-') {
            return 1;
        }
        return -1;
    }
}
