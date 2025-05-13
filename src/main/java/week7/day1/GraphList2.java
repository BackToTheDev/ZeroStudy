package week7.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 가중치가 있는 경우

class Vertex {
    int v; // 번호
    int w; // 가중치

    public Vertex(int v, int w) {
        this.v = v;
        this.w = w;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                "v=" + v +
                ", w=" + w +
                '}';
    }
}

public class GraphList2 {
    public static void main(String[] args) {
        List<ArrayList<Vertex>> graph = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(new Vertex(1, 3), new Vertex(3, 4))),
                new ArrayList<>(Arrays.asList(new Vertex(2, 1), new Vertex(4, 2))),
                new ArrayList<>(Arrays.asList(new Vertex(1, 7))),
                new ArrayList<>(Arrays.asList(new Vertex(4, 8), new Vertex(6, 5))),
                new ArrayList<>(Arrays.asList(new Vertex(5, 9))),
                new ArrayList<>(Arrays.asList()),
                new ArrayList<>(Arrays.asList(new Vertex(7, 6))),
                new ArrayList<>(Arrays.asList())
        ));

        for (int i = 0; i < graph.size(); i++) {
            System.out.println(i + " - " + graph.get(i));
        }
    }
}
