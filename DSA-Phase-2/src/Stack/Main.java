package Stack;

public class Main {
    public static void main(String[] args) {
        Stack.CustomStack obj = new Stack.CustomStack(5);
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.display();
        obj.pop();
        obj.display();
    }
}
