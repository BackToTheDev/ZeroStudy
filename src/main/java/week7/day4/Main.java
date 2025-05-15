package week7.day4;
import java.util.*;
import java.io.*;

class Node {
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            nodes.add(new Node(i));
        }

        Node root = nodes.get(0);

        for (int current = 0; current <= (N - 1) / 2; current++) {
            int left = 2 * current + 1;
            int right = 2 * current + 2;

            if (left < N) {
                nodes.get(current).left = nodes.get(left);
            }

            if (right < N) {
                nodes.get(current).right = nodes.get(right);
            }
        }

        List<Integer> result = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            result.add(node.value);

            if (node.left != null) {
                queue.add(node.left);
            }

            if (node.right != null) {
                queue.add(node.right);
            }
        }

        System.out.println(result);
    }
}
