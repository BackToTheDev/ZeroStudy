package week7.day2;
import java.util.*;
import java.io.*;

public class BinaryTreeList {
    public static void main(String[] args) {
        ArrayList<Integer> tree = new ArrayList<>(Arrays.asList(
                5, 4, 10, 15, 1, 20, 8, null, null, 3, 9, null, null, null, 12
        ));

        int target = 4;
        Integer left = (target * 2) + 1;
        Integer right = (target * 2) + 2;

        System.out.println(tree.get(target));
        System.out.println(tree.get(left));
        System.out.println(tree.get(right));
    }
}
