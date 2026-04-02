package Stack;

	import java.util.Stack;

	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class ReverseLinkedList {

	    Node head;

	    // Insert at end
	    void insert(int data) {
	        Node newNode = new Node(data);

	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node temp = head;
	        while (temp.next != null) {
	            temp = temp.next;
	        }

	        temp.next = newNode;
	    }

	    // Reverse using stack
	    void reverse() {

	        Stack<Integer> stack = new Stack<>();

	        Node temp = head;

	        // Push all elements into stack
	        while (temp != null) {
	            stack.push(temp.data);
	            temp = temp.next;
	        }

	        temp = head;

	        // Pop and assign back
	        while (temp != null) {
	            temp.data = stack.pop();
	            temp = temp.next;
	        }
	    }

	    // Display list
	    void display() {
	        Node temp = head;

	        while (temp != null) {
	            System.out.print(temp.data + " -> ");
	            temp = temp.next;
	        }

	        System.out.println("null");
	    }

	    public static void main(String[] args) {

	        ReverseLinkedList list = new ReverseLinkedList();

	        list.insert(1);
	        list.insert(2);
	        list.insert(3);
	        list.insert(4);

	        System.out.println("Original List:");
	        list.display();

	        list.reverse();

	        System.out.println("Reversed List:");
	        list.display();
	    }
	}

