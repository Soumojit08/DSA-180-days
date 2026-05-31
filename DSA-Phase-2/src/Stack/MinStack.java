package Stack;


import java.util.Stack;

public class MinStack {
    static Stack<Integer> allStack = new Stack<>();
    static Stack<Integer> minStack = new Stack<>();

    static void push(int val) {
        allStack.push(val);

        if (minStack.isEmpty()) {
            minStack.push(val);
        } else if (minStack.peek() >= val) {
            minStack.push(val);
        }
    }

    static void pop() {
        if (allStack.isEmpty()) System.out.println("Underflow");
        else if (minStack.peek().equals(allStack.peek())) {
            minStack.pop();
            allStack.pop();
        } else {
            allStack.pop();
        }
    }

    static int min() {
        if (minStack.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return minStack.peek();
        }
    }

    static int top() {
        if (allStack.isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return allStack.peek();
        }
    }

    static void minDisplay(){
        System.out.println("Min Stack : ");
        for (int i = minStack.size()-1; i>-1; i--){
            System.out.println(minStack.elementAt(i));
        }
        System.out.println();
    }

    static void allDisplay(){
        System.out.println("All Stack : ");
        for (int i = allStack.size()-1; i>-1; i--){
            System.out.println(allStack.elementAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
        push(10);
        push(20);
        push(5);
        push(6);
        push(3);
        push(11);
        allDisplay();
        minDisplay();

        int min = min();
        int top = top();
        System.out.println("Min : " + min);
        System.out.println("Top : " + top);
    }

}
