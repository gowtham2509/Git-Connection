package BasicProgram;

import java.util.List;
import java.util.Stack;

public class StackList {
    public static void main(String[] args) {
        Stack<String> stack=new Stack();
        stack.push("Gowtham");
        stack.push("Anand");
        stack.push("Ajith");
        stack.push("Dinesh");
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

    }
}
