package Stack;

public class Stack {
    public static class CustomStack{
        int[] data;
        int top;

        public CustomStack(int size){
            data = new int[size];
            top = -1;
        }

        int size(){
            return top+1;
        }

        void display(){
            for (int i=top; i>-1; i--){
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }

        void push(int val){
            if (top==data.length-1){
                System.out.println("Stack Overflow");
            } else {
                top++;
                data[top]=val;
            }
        }
        int pop(){
            if (top == -1){
                System.out.println("Stack Underflow");
                return -1;
            } else {
                int val = data[top];
                top--;
                return val;
            }
        }

        int top() {
            if (top == -1){
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return data[top];
            }
        }
    }

}
