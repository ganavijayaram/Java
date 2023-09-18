package List;

import java.util.Stack;

public class StackImp {
    public static void main(String arg[]) {
        Stack<String> stack = new Stack<>();
        stack.push("Ganavi");
        stack.peek();
        stack.pop();
        // to return the position of the element from the top
        stack.search("god");
        // to check if empty
        stack.empty();
    }
}
