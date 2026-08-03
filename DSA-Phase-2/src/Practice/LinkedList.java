package Practice;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size = 0;
    }

    private static class Node {
        private int data;
        private Node next;

        public Node(int val){
            this.data = val;
        }

        public Node(int val, Node next){
            this.data = val;
            this.next = next;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertEnd(int val){
        if (tail == null) insertFirst(val);
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtPosition(int val, int pos){
        if(pos < 0 || pos > size) {
            System.out.println("Invalid Pos");
            return;
        }
        if (pos==0) {
            insertFirst(val);
        }
        else if (pos==size) {
            insertEnd(val);
        } else {
            Node temp = head;

            for (int i = 1; i < pos; i++) {
                temp = temp.next;
            }

            Node node = new Node(val, temp.next);
            temp.next = node;
            size++;
        }
    }

    public void deleteFirst(){
        if (head == null){
            tail = null;
            System.out.println("No elem to delete");
            return;
        }
        head = head.next;
        size--;
    }

    public void deleteEnd(){
        if (head == null){
            System.out.println("No elem to delete");
            return;
        }
        Node temp = head;

        while (temp.next.next != null){
            temp = temp.next;
        }

        tail = temp;
        tail.next = null;
        size--;
    }

    public void deleteAtPos(int pos){
        if (pos < 0 || pos > size){
            System.out.println("Invalid Pos");
            return;
        } 
        if (pos == 0) {
            deleteFirst();
        } else if (pos == size) {
            deleteEnd();
        }
        else {
            Node temp = head;

            for (int i = 1; i< pos; i++){

            }
        }
    }

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(" End\n");
    }
}

class Sol{
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(30);
        list.insertFirst(20);
        list.insertFirst(10);
        list.display();
        list.insertEnd(40);
        list.insertEnd(50);
        list.display();
        list.insertAtPosition(25, 2);
        list.display();
        list.deleteFirst();
        list.display();
        list.deleteEnd();
        list.display();
        list.insertFirst(10);
        list.insertEnd(50);
        list.display();
    }
}
