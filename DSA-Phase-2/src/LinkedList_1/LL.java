package LinkedList_1;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    //LL constructor to initialize list size increases with no of nodes
    public LL() {
        this.size = 0;
    }

    //Node Structure
    private class Node {
        private int value;
        private Node next;

        //Node constructor to get value
        public Node(int value) {
            this.value = value;
        }
        //Node constructor to initialize value and next pointer
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    //insertFirst function
    public void inserFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail==null){
            tail = head;
        }
        size++;
    }

    //inserAtEnd function
    public void insertAtEnd(int val){
        if (tail == null) inserFirst(val);

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int pos, int val){
        if(pos < 0 || pos > size){
            System.out.println("Invalid Position");
            return;
        }

        if (pos == 0) {
            inserFirst(val);
            return;
        };
        if (pos == size){
            insertAtEnd(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    //Delete first
    public void deleteFirst(){
        int val = head.value;
        head = head.next;

        if (head == null){
            tail = null;
        }
        size--;
        System.out.println("deleted First : " + val);
    }

    //Delete End
    public void deleteEnd(){
        if (size<=1){
            deleteFirst();
            return;
        }

        Node temp = head;
        int val = tail.value;

        for (int i = 1; i < size - 1; i++) {
            temp = temp.next;
        }
        tail = temp;
        temp.next = null;
        size--;

        System.out.println("Deleted End: " + val);
    }

    //Display list with temp node
    public void displayList(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " -> " );
            temp = temp.next;
        }
        System.out.print("END");
    }
}



