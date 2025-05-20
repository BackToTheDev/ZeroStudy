package week8.day2;


public class SinglyLinkedList {

    static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

        private Node head; // 첫 번째 노드를 가리키는 포인터

        SinglyLinkedList() {
            this.head = null; // 리스트 생성?
        }

        //삽입 (뒤에)
        public void add(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode; // 리스트가 비어있다면 첫 번째 노드로 설정
            } else {
                Node current = head;
                while(current.next != null) {
                    current = current.next; // 끝까지 이동
                }
                current.next = newNode;
            }
        }

        // 삭제
        public void remove() {
            if (head == null) {
                System.out.println("리스트가 비어있습니다.");
            } else {
                head = head.next; // 첫번째 노드를 삭제하고 다음 노드를 헤드로 변경
            }
        }

        public boolean search(int value) {
            Node current = head;
            while (current != null) {
                if (current.value == value) {
                    return true; // 값이 있다면 true 리턴
                }
                current = current.next;
            }
            return false; // 값이 없다면 false 리턴
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

     class Main {
        public static void main(String[] args) {
            SinglyLinkedList list = new SinglyLinkedList();
            list.add(10);
            list.add(20);
            list.add(30);

            list.printList();

            list.search(20);


        }
    }


