package week6.day5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Greedy2 {

    public static class Item implements Comparable<Item> {
        int weight, value;

        public Item (int weight, int value) {
            this.weight = weight;
            this.value = value;
        }

        @Override
        public int compareTo(Item other) {
            double ratio1 = (double) this.value / this.weight;
            double ratio2 = (double) other.value / other.weight;
            return Double.compare(ratio2, ratio1); // 내가 앞에 있으면 오름차순 뒤에 있으면 내림차순
        }

        @Override
        public String toString() {
            return String.format("[%s, %s, %s]", weight, value, ((double) value/ weight));
        }
    }

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputData = br.readLine().split(" ");
        int n = Integer.parseInt(inputData[0]); // 개수
        int w = Integer.parseInt(inputData[1]); // 최대 무게


        List<Item> items = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputData = br.readLine().split(" ");
            int wight = Integer.parseInt(inputData[0]); // 무게
            int value = Integer.parseInt(inputData[1]); // 가치
            items.add(new Item(wight, value));
        }

        Collections.sort(items);

        int totalValue = 0; // 결과 가치
        int currentWeight = 0;

        for (Item item : items) {
            if (currentWeight + item.weight <= w) {
                currentWeight += item.weight;
                totalValue += item.value;
            } else {
                int remainWeight = w - currentWeight;
                totalValue += (item.value * remainWeight) / item.weight;
                break;
            }
        }
        System.out.println(totalValue);
    }
}
