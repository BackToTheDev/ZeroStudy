package week9;
import java.util.*;
import java.io.*;

public class DoublyLinkedList1 {
    private int size;
    private Node head;
    private Node tail;


    class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

        public void addAt(int index, int value) {
            Node newNode = new Node(value);

            if (index < 0 || index > size) {
                System.out.println("잘못된 입력입니다."); // 0 보다 작거나 size 보다 클 경우
                return;
            }

            if (index == 0) { // addFirst
                if (head == null) {
                    head = newNode;
                    tail = newNode;
                } else {
                 newNode.next = head;
                 head.prev = newNode;
                 head = newNode;


                }
            }

            if (index == size) {// addLast
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            } else if (index > 0 && index < size) {
                Node current = head;
                for (int i = 0; i < index; i ++) {
                    current = current.next;
                }
              Node prevNode = current.prev;
                prevNode.next = newNode;
                newNode.prev = prevNode;

                newNode.next = current;
                current.prev = newNode;
            }
            size++;
            }

            public void removeAt(int index) {
        if (head == null) {
            System.out.println("리스트가 비어있음");
            return;
        }
        if (index == 0) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
              head = head.next;
              head.prev = null;
            }
        }

            if (index == size - 1) {
                tail = tail.prev;
                tail.next = null;
            } else {
                Node current = head;
                for (int i = 0; i < index; i++) {
                    current = current.next;
                }

                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
            }


