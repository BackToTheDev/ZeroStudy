package week7.day3;
import java.util.*;

class Node1 {
    int value;
    Node right;
    Node left;

    public Node1(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BfsSelf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            nodes.add(new Node(i));
        }

        Node root = nodes.get(0);

        for (int current = 0; current <= (N-1) / 2; current++) {
            int left = 2 * current + 1;
            int right = 2 * current + 2;
            if (left < N) {
                nodes.get(current).left = nodes.get(left);
            }

            if (right < N) {
                nodes.get(current).right = nodes.get(right);
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        preOrder(root, result);

        System.out.println(result);

    }

    public static void preOrder(Node node, List<Integer> result) {
        if (node != null) {
            result.add(node.value);
            preOrder(node.left, result);
            preOrder(node.right, result);
        }
    }
}
