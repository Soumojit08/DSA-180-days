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



