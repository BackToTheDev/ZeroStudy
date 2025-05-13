package week7.day1;
import java.util.*;
import java.io.*;
// 가중치가 없는 경우
public class GraphList {
    public static void main(String[] args) {
        List<ArrayList<Integer>> graph = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1, 3)),
                new ArrayList<>(Arrays.asList(2, 4)),
                new ArrayList<>(Arrays.asList(1)),
                new ArrayList<>(Arrays.asList(4, 6)),
                new ArrayList<>(Arrays.asList(5)),
                new ArrayList<>(Arrays.asList()),
                new ArrayList<>(Arrays.asList(7)),
                new ArrayList<>(Arrays.asList())
        ));

        for (int i = 0; i < graph.size(); i++) {
            System.out.println(i + " - " + graph.get(i));
        }
    }
}
