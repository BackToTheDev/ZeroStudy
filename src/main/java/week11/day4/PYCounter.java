package week11.day4;
import java.util.*;
import java.util.stream.*;
import java.io.*;

public class PYCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        long pCount = s.chars()
                .filter(c -> c == 'p' || c == 'P')
                .count();

        long yCount = s.chars() // chars()는 String을 char타입으로 변화시켜주고 char의 문자를 유니코드 intValue값으로 변경시켜준다.
                .filter(c -> c == 'y' || c == 'Y')
                .count();

        if (yCount == pCount) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
