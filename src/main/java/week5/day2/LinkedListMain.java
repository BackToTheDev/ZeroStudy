package week5.day2;
import java.util.*;

public class LinkedListMain {

    public static class CustomLinkedList {
        private static class Node {
            int value;
            Node pointer;

            public Node(int value) {
                this.value = value;
                this.pointer = null;
            }
        }

        private Node head; // list의 시작점
        private int size;

        public CustomLinkedList() {
            this.size = 0;
        }

        public void add(int value) {
            if (head == null) {
                head = new Node(value);
            } else {
                Node current = head;

                while (current.pointer != null) {
                    current = current.pointer;
                }
                current.pointer = new Node(value);
            }
            size++;
        }

        public void add(int index, int value) {
            // 인덱스 유효범위
            Node newNode = new Node(value);

            if (index == 0) {
                // 새로운 값
                newNode.pointer = head;
                head = newNode;
            } else {
                //사이에 값을 추가해줄 때
                Node prev = head;
                for(int i = 0; i < index - 1; i++) {
                    prev = prev.pointer;
                    newNode.pointer = prev.pointer;
                    prev.pointer = newNode;

                }
            }
        }

        public void remove() {
            Node current = head;

            while(current.pointer != null) {

                   if(current.pointer.pointer != null) {
                       current = current.pointer;
                   } else {
                       current.pointer = null;
                       size--;
                       break;
                   }
            }
        }

        public void remove(int index) {
            if (index == 0) {
                head = head.pointer;
            } else {
                Node prev = head;
                for (int i = 0; i < index - 1; i++) {
                    prev = prev.pointer;
                    //prev.pointer // 내가 삭제하고자 하는 node
                    prev.pointer = prev.pointer.pointer;
                }
            }
        }

        public int get(int index) {
            // 인덱스의 유효 범위 체크
//            Node current = head;
//            for (int i = 0; i < size; i++) {
//                if (i == index) return current.value;
//                current = current.pointer;
//            }
//            return -1;
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.pointer;
            }
            return current.value;
        }

        public void print() {
            StringBuffer sb = new StringBuffer();
            sb.append("[");
            Node current = head;
            while (true) {
                sb.append(current.value);
                if (current.pointer != null) sb.append(", ");
                current = current.pointer;
                if (current == null) break;
            }
            sb.append("]");
            System.out.println(sb.toString());
        }

        public static void main(String[] args) {

            CustomLinkedList list = new CustomLinkedList();

            list.add(10);
            list.add(20);
            list.add(30);
            list.print();

            list.remove();
            list.print();

            System.out.println(list.get(1));

            list.add(30);
            list.print();

            list.add(1, 15);
            list.print();
        }
    }
}
