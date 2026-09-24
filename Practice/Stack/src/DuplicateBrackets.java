import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        String st = "((a+b) + ((c+d)))";

        boolean ans = duplicateBrackets(st);
        System.out.println(ans);
    }

    public static boolean duplicateBrackets(String st){
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<st.length(); i++){
            char ch = st.charAt(i);

            if (ch == ')'){
                if (stack.peek() == '(') {
                    // means it contains duplicate
                    return true;
                } else {
                    while (stack.peek() != '('){
                        stack.pop();
                    }
                    stack.pop();
                }
            } else {
                stack.push(ch);
            }
        }
        return false;
    }

}
