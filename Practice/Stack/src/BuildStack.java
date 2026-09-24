public class BuildStack {
    static int size = 5;
    static int top = -1;
    public static void main(String[] args) {
        int[] stack = new int[size];


        push(stack,10);
        push(stack,20);
        push(stack,30);
        push(stack,40);
        display(stack);
        pop(stack);
        peek(stack);

    }

    public static void push(int[] stack, int val) {
        if (top == size-1){
            System.out.println("Stack overflow");
        }
        stack[++top] = val;
    }

    public static void pop(int[] stack) {
        if (top == -1){
            System.out.println("Stack underflow");
        }
        int elem = stack[top--];
        System.out.println("Removed elem : " + elem);
    }

    public static void peek(int[] stack) {
        if (top == -1){
            System.out.println("Stack Underflow");
        }

        System.out.println(stack[top]);
    }

    public static void display(int[] stack){
        System.out.print("[");
        for (int i = top; i>-1; i--){
            System.out.print(stack[i]+ " ");
        }
        System.out.println("]");
    }
}
