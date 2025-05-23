package week8.day3;
import java.util.*;

public class DoublyLinkedList {

    static class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("잘못된 인덱스 입니다.");
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.value;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = head;
            size++;
        } else if (head != null) {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            size++;
        }
    }

    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = head;
            size++;
        } else {
            Node current = head;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            size++;
        }
    }

    public void addAt(int index, int value) {
        Node newNode = new Node(value);

        if (index < 0 || index > size) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        if (index == 0) {
            addFirst(value);
            return;
        }

        if (index == size) {
            add(value);
            return;
        } else if (index > 0 && index < size) {
            Node current = head;

            for (int i = 0; i < index; i++) {
                current = current.next;
            }

            Node prevNode = current.prev;

            prevNode.next = newNode;
            newNode.prev = prevNode;

            newNode.next = current;
            current.prev = newNode;
            size++;
        }
    }

    public void firstRemove() {
        if (head == null) {
            System.out.println("비어있는 리스트입니다.");
            return;
        } else if (head == tail){
            head = null;
            tail = null;
            size--;
        } else {
            Node current = head;
            head = current.next;
            head.prev = null;
            size--;
        }
    }

   public void removeAt(int index) {
        if (head == null) {
            System.out.println("리스트가 비어있습니다.");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        if (size == 1) {
            head = null;
            tail = null;
            size--;
            return;
        }

        if (index == 0) {
            head = head.next;
            head.prev = null;
            size--;
            return;
        }

        if (index == size - 1) {
            tail = tail.prev;
            tail.next = null;
            size--;
            return;
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
            return;
        }
   }

    public void remove() {
        Node current = tail;
        if (head == null) {
            System.out.println("리스트가 비어있습니다.");
        } else if (current != null) {
            if (head != tail) {
                tail = current.prev;
                tail.next = null;
                size--;
            } else if (head == tail) {
                head = null;
                tail = null;
                size--;
            }
        }
    }

    public void printBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.prev;
        }
        System.out.println();
    }


    public void printForward() {
        Node current = head;
            while (current != null) {
                System.out.print(current.value + " ");
                current = current.next;
            }
        System.out.println();
        }
    }


class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.add(10);
        list.add(20);

        list.printForward();
        list.printBackward();

        list.remove();
        list.remove();
        list.printForward();

        list.add(30);
        list.printForward();

        list.addFirst(50);
        list.printForward();

        list.addAt(1, 20);
        list.addAt(2, 99);
        list.printForward();

        list.removeAt(1);
        list.printForward();

        System.out.println(list.get(2));
    }
}
