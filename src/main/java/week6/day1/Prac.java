package week6.day1;
import java.util.*;

public class Prac {

    public static String solution(String s) {
        // 등장 횟수 저장 배열
        int[] count = new int[10];

        // 문자열 -> char '0'을 더해서 숫자로 변환 -> 등장 횟수 카운트
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            count[digit]++;
        }

        // 0부터 9까지 숫자 넣기
        List<Integer> digits = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            digits.add(i);
        }

        digits.sort((a, b) -> {
            if (count[a] == count[b]) {
                return Integer.compare(a, b); // 등장 횟수 같으면 숫자 작은 순
            } else {
                return Integer.compare(count[b], count[a]);
            }
        });

        StringBuffer sb = new StringBuffer();
        for (int num : digits) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();

    }

    public static void main(String[] args) {
        String s = "221123";
        System.out.println(solution(s));
    }
}
