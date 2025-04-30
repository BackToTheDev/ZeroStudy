package week5.day2;
import java.util.*;
import java.io.*;

public class List2 {

    public static class DoubleLinkedList {
        public static class Node {
            int data;
            Node prev;
            Node next;

            public Node(int data) {
                this.data = data;
                this.prev = null;
                this.next = null;
            }
        }

        private Node head;
        private Node tail;
        private int size;

        public DoubleLinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        // 가장 마지막에 데이터를 입력하는 add
        public void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            size++;
        }

        public void addFirst(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head.prev = newNode;
                head = newNode;
            }
            size++;
        }

        public void add(int index, int data) {
            // index의 유효범위를 확인
            if (index == 0) {
                addFirst(data);
                return;
            }
            if(index == size) {
                add(data);
                return;
            }

            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i< index; i++) {
                current = current.next;
            }

            newNode.next = current;
            newNode.prev = current.prev;
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }

        public void removeLast() {
            if (size == 0) return;

            if (head == tail) {
               head = null;
               tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
            size--;
        }

        public void removeFirst() {
            if (size == 0) return;

            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            size--;
        }

        public void remove(int index) {
            // index 요휴범위 확인 필요
            if (index == 0) {
                removeFirst();
                return;
            }
            if (index == size - 1) {
                removeLast();
                return;
            }

            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            current.prev.next = current.next;
            current.next.prev = current.prev;
        }

        public void printList() {
            StringBuffer sb = new StringBuffer();
            sb.append("[");
            Node current = head;
            while (current != null) {
                sb.append(current.data);
                if (current.next != null) sb.append(", ");
                current = current.next;
                }
            sb.append("]");
            System.out.println(sb.toString());

    }
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.printList();

        list.addFirst(5);
        list.printList();

        list.add(2, 15);
        list.printList();

        list.removeLast();
        list.printList();

        list.removeFirst();
        list.printList();

        list.remove(1);
        list.printList();

    }

}
