package Stack;

public class SmallestElement {
	class StackArray {

	    private int arr[];
	    private int top;
	    private int capacity;

	    public StackArray(int size) {
	        arr = new int[size];
	        capacity = size;
	        top = -1;
	    }

	    public void push(int x) {
	        if (top == capacity - 1) {
	            System.out.println("Stack Overflow");
	            return;
	        }
	        arr[++top] = x;
	    }

	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack Underflow");
	            return -1;
	        }
	        return arr[top--];
	    }

	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack Empty");
	            return -1;
	        }
	        return arr[top];
	    }

	    public boolean isEmpty() {
	        return top == -1;
	    }

	    // Find smallest element
	    public int getMin() {

	        if (isEmpty()) {
	            System.out.println("Stack Empty");
	            return -1;
	        }

	        int min = arr[0];

	        for (int i = 1; i <= top; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        return min;
	    }
	} 
}
