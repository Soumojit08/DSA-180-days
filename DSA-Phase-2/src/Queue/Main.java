package Queue;

public class Main {
    public static class CustomQueue {
        int[] data;
        int front;
        int rear;
        int size;

        public CustomQueue(int cap){
            data = new int[cap];
            front = -1;
            rear = -1;
            size = 0;
        }

        int size(){
            return size;
        }

        void enqueue(int val){
            if (rear == data.length-1){
                System.out.println("Insertion failed Queue overflow");

            }else if (front == -1) {
                front = 0;
                rear = 0;
                data[rear] = val;
                size++;
                System.out.println("Insertion Successful : " + val);
            } else {
                rear++;
                data[rear] = val;
                size++;
                System.out.println("Insertion Successful : " + val);
            }
        }

        int dequeue(){
            if (front == rear & front!=0){
                System.out.println("Queue Underflow");
                return -1;
            } else {
                System.out.println("\nDeleted item : " + data[front]);
                front++;
                if (front == rear){
                    front = rear = -1;
                }
                size--;
                return data[front];
            }
        }

        int peek() {
            if (front == rear && front!=0){
                System.out.println("Queue Underflow No elem");
                return -1;
            } else {
                return data[front];
            }
        }

        void display(){
            System.out.print("Queue elems : ");
            for (int i = front; i <= rear; i++) {
                System.out.print(data[i] + " ");
            }
        }
    }
}

class Sol {
    public static void main(String[] args) {
        Main.CustomQueue obj = new Main.CustomQueue(5);
        obj.enqueue(10);
        obj.enqueue(20);
        obj.enqueue(30);
        obj.enqueue(40);
        obj.enqueue(50);
//        obj.enqueue(60);
        obj.display();
        obj.dequeue();
        obj.display();
        int ans = obj.peek();
        System.out.println("\nfront : " + ans);
        int size = obj.size();
        System.out.println(size);

    }
}
