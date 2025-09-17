import java.util.Stack;

public class SortStackRecursion {
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            insertAtRightPosition(stack, temp);
        }
    }

    private static void insertAtRightPosition(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || stack.peek() <= element) {
            stack.push(element);
            return;
        }
        int temp = stack.pop();
        insertAtRightPosition(stack, element);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(20);
        sortStack(stack);
        System.out.println("Sorted stack: " + stack);
    }
}