package week5.day3;
import java.util.*;
import java.io.*;

public class Stack4 { // 연산자의 우선순위 공평할때
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String inputData = br.readLine();

        Stack<Character> stack = new Stack<>();

        for (char ch : inputData.toCharArray()) {
            if ('0' <= ch && ch <= '9') {
                sb.append(ch);
            } else { //연산자
                if (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        if (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb.toString());
    }
}
