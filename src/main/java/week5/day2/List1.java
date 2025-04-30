package week5.day2;
import java.util.*;
import java.io.*;
public class List1 {
    public static void main(String[] ages) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        while (true) {
            String line = br.readLine();
            String[] detail = line.split(" ");
           // 0번째 위치의 값은 항상 데이터가 플래그(I, D, E) 이다.

            if (detail[0].equals("E")) break; // 문자열 비교 (같음) == 안되

            if(detail[0].equals("I")) {
                int value = Integer.parseInt(detail[1]);
                if (detail.length == 3) {
                    int index = Integer.parseInt(detail[2]);
                    list.add(index, value);
                } else {
                    list.add(value);
                }
            } else if(detail[0].equals("D")) {
                list.remove(list.size() - 1);
            }
        }

        // 가장 마지막 값, (비어있다면 - 1)
        System.out.println(list.isEmpty() ? -1 : list.get(list.size() - 1));
        // 모든 값,(비어있다면 - 1)
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//            if (i < list.size() - 1) System.out.print(", ");
//        }
//        System.out.println();
//        // 사이즈

        String fullData = null;
        if (list.isEmpty()) fullData = "-1";
        StringJoiner sj = new StringJoiner(", ");
        for (int data : list) {
            sj.add(Integer.toString(data));
            fullData = sj.toString();
            System.out.println(fullData);
        }
    }
}
