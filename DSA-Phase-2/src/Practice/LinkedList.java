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

    }

    public void deleteFirst(){

    }

    public void deleteEnd(){

    }

    public void deleteAtPos(){

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
    }
}
