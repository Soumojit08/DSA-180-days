package Practice;

public class StackUsingArray {
    public static class Stack {
        int[] stack;
        int top;
        int size;

        public Stack(int capacity){
            stack = new int[capacity]; //memory allocation to array
            top = -1;
            size = 0;
        }

        void push(int val){
            if (top == stack.length - 1){
                System.out.println("Stack Overflow");
            }
            else {
                top = top + 1;
                stack[top] = val;
                size++;
                System.out.println("Element Inserted : " + stack[top]);
            }
        }

        void pop() {
            if (top == -1){
                System.out.println("Stack Underflow");
            } else {
                System.out.println("Deleted elem : " + stack[top]);
                top = top - 1;
                size--;
            }
        }

        void display(){
            System.out.println("Stack Elements : ");
            for (int i = top; i > -1 ; i--) {
                System.out.println(stack[i]);
            }
        }

        int peek(){
            if (top == -1){
                System.out.println("Stack Underflow");
                return -1;
            } else {
                return stack[top];
            }
        }

        int size(){
            return size;
        }
    }
}

class Main{
    public static void main(String[] args) {
        StackUsingArray.Stack stack = new StackUsingArray.Stack(5);//object creation of Stack class

        //calling func
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
        int top = stack.peek();
        System.out.println("Top : " + top);
    }
}
