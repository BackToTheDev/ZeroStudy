package week7.day6;
import java.util.*;

public class ArrList1 {

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


        public void add(int value) {
            resizeDataSize();
            data[size] = value;
            size++;
        }

        public void add (int index, int value) {
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

        public void remove() {
            if (size <= 0) {
                System.out.println("삭ㅈ할 요소가 없습니다.");
                return;
            }
            size--;
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

        public void get() {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < size; i++) {
                sb.append(i).append(" ");
                System.out.println(sb.toString());
            }
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

        public void resizeDataSize() {
            if (data.length > size) {
                return;
            }

            int newSize = data.length * 2;
            int[] newData = new int[newSize];
            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }


    public static void main(String[] args) {
        CustomArrayList arr = new CustomArrayList(5);
        arr.print();
        arr.add(10);
        arr.add(10);
        arr.print();
        arr.remove();
        arr.print();

        arr.add(4, 15);
        arr.realPrint();

        arr.remove(1);
        arr.realPrint();


    }
}
