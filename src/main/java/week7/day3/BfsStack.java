package week7.day3;
import java.util.*;

class Node {
    int value;
    Node right;
    Node left;

    public Node(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

public class BfsStack {
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
        ArrayList<Node> stack = new ArrayList<>();

        stack.add(root);

        while (!stack.isEmpty()) {
            Node node = stack.getLast();
            stack.removeLast();
            result.add(node.value); // visit

            if(node.right != null) { //right
                stack.add(node.right);
            }

            if(node.left != null) { //left
                stack.add(node.left);
            }
        }

        System.out.println(result);
    }
}
