package week5.day2;

import java.util.*;



public class ArrayListMain {

    public static class CustomArrayList {
        private int defaultSize = 10;
        private int[] data;
        private int size = 0;

        public CustomArrayList() {
            data = new int[defaultSize];
        }

        public CustomArrayList(int size) {
            data = new int[size];
        }

        public void print() {
            StringBuffer sb = new StringBuffer();
            sb.append("[");
            for (int i = 0; i < size; i++) {
                sb.append(data[i]);
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
                sb.append("]");
            System.out.println(sb.toString());
        }

        public void realPrint() {
            System.out.println(Arrays.toString(data));
        }

        public void add(int value) {
            resizeDataSize();
            data[size] = value;
            size++;
        }

        public void add(int index, int value) {
            if (index < 0 || index > size) {
                System.out.println("인덱스 범위 초과");
                return;
            }
            resizeDataSize();
            for(int i = size; i > index; i--) {
                data[i] = data[i - 1];
            }
            data[index] = value;
            size++;
        }

        public void remove(int index) {
            if (index < 0 || index >= size) {
                System.out.println("인덱스 범위 초과");
                return;
            }

            for (int i = index; i < size - 1; i++) {
                data[i] = data[i + 1];
            }
            size--;
        }

        public void remove() {
            size--;
        }

        public int get(int index) {
            return data[index];
        }

        private void resizeDataSize() {
            if (data.length > size) {
                return;
            }
            int newSize = data.length * 2;
            int[] newArr = new int[newSize];

            for (int i = 0; i < data.length; i++) {
                newArr[i] = data[i];
                data = newArr;
            }
        }
    }


    public static void main(String[] args) {
        CustomArrayList list1 = new CustomArrayList();
        list1.print();
        list1.add(10); // 10을 2번째 위치에 넣고 싶다.
        list1.print();
        list1.add(5);
        list1.print();
        list1.remove();
        list1.print(); // 1, 1번째 위치를 삭제하고 싶다.
        list1.add(0, 3);
        list1.print();
        list1.remove(0);
        list1.print();

        System.out.println(list1.get(0));


    }
}
