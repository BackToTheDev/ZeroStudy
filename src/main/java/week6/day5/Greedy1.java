package week6.day5;
import java.util.*;
import java.io.*;

public class Greedy1 {

    public static class Meeting implements Comparable<Meeting>{
         int start;
         int end;

        public Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Meeting other) {
            if (this.end == other.end)
                return this.start - other.start;

            return this.end - other.end; // 내 값이 더 크면 양수 내 값이 더 작으면 음수
        } // 결과가 양수면 오름차순이고 결과가 음수면 내림차순이다.

        @Override
        public String toString() {
            return String.format("[%s, %s]", this.start, this.end);
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 회의 개수

        List<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] inputData = br.readLine().split(" ");
            int start = Integer.parseInt(inputData[0]);
            int end = Integer.parseInt(inputData[1]);
            meetings.add(new Meeting(start, end));
        }


        Collections.sort(meetings);


        int count = 0;
        int lastEndTime = 0;

        for (Meeting m : meetings) {
            if (m.start >= lastEndTime) {
                count++;
                lastEndTime = m.end;
                System.out.println(m);
            }
        }
        System.out.println(count);

    }
}
