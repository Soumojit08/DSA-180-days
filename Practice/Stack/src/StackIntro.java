import java.util.Stack;

public class StackIntro {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(100);
        stack.push(1000);
        stack.push(10000);
        stack.push(100000);
        System.out.println(stack);
        stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
        System.out.println("Size : " + stack.size());
    }
}
