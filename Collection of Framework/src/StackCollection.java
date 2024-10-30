import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {


        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        System.out.println(stack.size());
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);

        System.out.println(stack.isEmpty());

        for (String item : stack) {
            System.out.println(item);
        }

    }
}
