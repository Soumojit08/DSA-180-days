package Linklist_2;

public class SinglyLinkList {

    static class Node {
        int data;
        Node next;

        //constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    //constructor
    SinglyLinkList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insertAtHead(int data) {
        Node newNode = new Node(data);

        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    //position 1-based index
    public void insertAtPosition(int data, int pos) {
        if (pos < 1 || pos > size + 1) {
            System.out.println("Insertion not possible");
        } else if (pos == 1) {
            insertAtHead(data);
        } else if (pos == size + 1) {
            insertAtTail(data);
        } else {
            Node prevNode = head;
            //move prev node by (pos-2) to reach destination
            for (int i = 1; i <= pos - 2; i++) {
                prevNode = prevNode.next;
            }
            Node newNode = new Node(data);
            //update links
            newNode.next = prevNode.next;
            prevNode.next = newNode;
            size++;
        }

    }


    public void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("X");

    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getHead() {
        if (head == null) return -1;
        return head.data;
    }

    public int getTail() {
        if (tail == null) return -1;
        return tail.data;
    }

    public boolean search(int data) {
        Node temp = head;
        int pos = 1;

        while (temp != null) {
            if (temp.data == data) {
                System.out.println("At position : " + pos);
                return true;
            } else {
                temp = temp.next;
                pos++;
            }
        }
        return false;
    }

    public void updateUsingPos(int data, int pos) {
        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid Position");
        }
        Node temp = head;

        for (int i = 1; i <= pos - 1; i++) {
            temp = temp.next;
        }
        temp.data = data;
    }

    public void deleteHead() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        head = head.next;
        size--;

        //if become empty after delete tail null
        if (head == null){
            tail = null;
        }
    }

    public void deleteTail() {
        if (head == null) {
            System.out.println("Nothing to delete");
            return;
        }
        if (head == tail) {
            deleteHead();
        } else {
            Node temp = head;
            //reach 2nd last elem
            for (int i = 1; i <= size-2; i++) {
                temp = temp.next;
            }
            temp.next = null;
            size--;
        }
    }

    public void deleteAtPosition(int pos) {

    }


    public static void main(String[] args) {
        SinglyLinkList list = new SinglyLinkList();
        if (list.isEmpty()) {
            System.out.println("List is empty");
        }
        System.out.println("Size of list : " + list.getSize());

        list.insertAtHead(10);
        list.printList();
        list.insertAtHead(20);
        list.printList();
        list.insertAtHead(30);
        list.printList();
        list.insertAtTail(100);
        list.printList();
        list.insertAtTail(110);
        list.printList();
        list.insertAtTail(120);
        list.printList();
        list.insertAtPosition(22, 1);
        list.printList();
        list.insertAtPosition(122, 8);
        list.printList();
        list.insertAtPosition(500, 5);
        list.printList();

        System.out.println("Head : " + list.getHead());
        System.out.println("Tail : " + list.getTail());
        System.out.println("Size : " + list.getSize());
        System.out.println(list.search(500));
        list.updateUsingPos(5000, 5);
        list.printList();
        list.deleteHead();
        list.printList();
        list.deleteTail();
        list.printList();
        System.out.println("Size : " + list.getSize());
    }
}
