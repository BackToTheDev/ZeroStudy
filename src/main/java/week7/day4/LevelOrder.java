package week7.day4;
import java.util.*;
import java.io.*;

public class LevelOrder {
    static final int UND = -1;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        List<List<Integer>> graph = new ArrayList<>(1);
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            graph.get(s).add(e);
        }

        List<Integer> visited = new ArrayList<>(Collections.nCopies(N + 1, UND));
        Queue<Integer> queue = new LinkedList<>();

        visited.set(X, 0);
        queue.add(X);

        List<Integer> result = new ArrayList<>();

        while(!queue.isEmpty()) {
            int current = queue.poll();
            for (int nextNode : graph.get(current)) {
                if(visited.get(nextNode) == UND) {
                    visited.set(nextNode, visited.get(current) + 1);
                    queue.add(nextNode);
                }
            }
        }

        for (int i = 0; i <= N; i++) {
            if (visited.get(i) == K) {
                result.add(i);
            }
        }

        if (result.isEmpty()) {
            System.out.println(-1);
        } else {
            Collections.sort(result);
            for (int value : result) {
                System.out.println(value);
            }
        }
    }
}
