package week7.day1;
import java.util.*;
import java.io.*;

public class GraphMatrix {
    public static void main(String[] args) {
        final int INF = 987654321;

        List<ArrayList<Integer>> graph = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(INF,1,INF,1,INF,INF,INF,INF)),
                new ArrayList<>(Arrays.asList(INF,INF,1,INF,1,INF,INF,INF)),
                new ArrayList<>(Arrays.asList(INF,1,INF,INF,INF,INF,INF,INF)),
                new ArrayList<>(Arrays.asList(INF,INF,INF,INF, 1,INF, 1,INF)),
                new ArrayList<>(Arrays.asList(INF,INF,INF,INF,INF,1,INF,INF)),
                new ArrayList<>(Arrays.asList(INF,INF,INF,INF,INF,INF,INF,INF)),
                new ArrayList<>(Arrays.asList(INF,INF,INF,INF,INF,INF,INF,1)),
                new ArrayList<>(Arrays.asList(INF,INF,INF,INF,INF,INF,INF,INF))
        ));



        for (int i = 0; i < graph.size(); i++) {
            System.out.println(graph.get(i));
        }
    }
}
