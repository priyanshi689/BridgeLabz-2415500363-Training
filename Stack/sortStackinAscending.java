import java.util.Stack;

public class sortStackinAscending {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack: " + stack);

        sortStack(stack);

        System.out.println("Sorted Stack: " + stack);
    }

    public static void sortStack(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int temp = stack.pop();

        sortStack(stack);

        insertInSortedOrder(stack, temp);
    }

    public static void insertInSortedOrder(Stack<Integer> stack, int item) {

        if (stack.isEmpty() || item > stack.peek()) {
            stack.push(item);
            return;
        }

        int temp = stack.pop();

        insertInSortedOrder(stack, item);

        stack.push(temp);
    }
}