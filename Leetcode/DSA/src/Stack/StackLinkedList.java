package Stack;
	
class StackLinkedList {

	    // Node class
	    class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    Node top;

	    // Push
	    public void push(int x) {
	        Node newNode = new Node(x);
	        newNode.next = top;
	        top = newNode;
	    }

	    // Pop
	    public int pop() {
	        if (isEmpty()) {
	            System.out.println("Stack Underflow");
	            return -1;
	        }

	        int value = top.data;
	        top = top.next;
	        return value;
	    }

	    // Peek
	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Stack Empty");
	            return -1;
	        }
	        return top.data;
	    }

	    // isEmpty
	    public boolean isEmpty() {
	        return top == null;
	    }
	}
}
