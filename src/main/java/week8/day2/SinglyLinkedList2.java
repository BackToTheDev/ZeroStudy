package week8.day2;

public class SinglyLinkedList2 {

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    private Node head;

    public SinglyLinkedList2() {
        this.head = null;
    }

    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void remove() {
        if (head == null) {
            System.out.println("리스트가 비어있습니다.");
        } else {
            head = head.next;
        }
    }

    public boolean search(int value) {
        Node current = head;
        while (current != null) {
            if (current.value == value) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println();
    }
}

 class Main1 {
    public static void main(String[] args) {
        SinglyLinkedList2 list = new SinglyLinkedList2();
        list.add(10);
        list.add(20);
        list.add(30);

        list.printList();

        list.remove();
        list.printList();

        System.out.println("20이 있나? : " + list.search(20));
        System.out.println("10이 있나? : " + list.search(10));

    }
}
