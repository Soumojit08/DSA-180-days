package LinkedList_1;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.inserFirst(10);
        list.inserFirst(20);
        list.inserFirst(30);
        list.inserFirst(40);
        list.insertAtEnd(5);

        list.displayList();
    }
}
