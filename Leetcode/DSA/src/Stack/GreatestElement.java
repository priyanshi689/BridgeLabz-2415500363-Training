package Stack;

public class GreatestElement {

	    private int arr[];
	    private int top;
	    private int capacity;

	    public GreatestElement(int size) {
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

	    // Find greatest element
	    public int getMax() {
	        if (isEmpty()) {
	            System.out.println("Stack Empty");
	            return -1;
	        }

	        int max = arr[0];

	        for (int i = 1; i <= top; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        return max;
	    }
	}

