

class Node{
	    int data;
	    Node prev;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	        this.prev = null;
	    }
	}
class Deque{
	Node rear;
	Node front;
	
	void insertAtFront(int val) {
		Node newnode = new Node(val);
		
		if(front == null) {
			front = newnode;
			rear = newnode;
			return;
		}
		newnode.next = front;
		front.prev = newnode;
		front = newnode; 
	}
	void insertAtEnd(int val) {
		Node newnode = new Node(val);
		if(rear == null) {
			front  = newnode;
			rear = newnode;
			return;
		}
		rear.next = newnode;
	    newnode.prev = rear;
	    rear = newnode;  
	}
	void display() {
	    if (front == null) {
	        System.out.println("Deque is empty");
	        return;
	    }

	    Node temp = front;

	    while (temp != null) {
	        System.out.print(temp.data );
	        temp = temp.next;
	    }

	    System.out.println();
	}
	int deleteAtFront() {
	    if (front == null) {
	        return;
	    }

	    int val = front.data;
	    front = front.next;

	    if (front != null) {
	        front.prev = null;
	    } else {
	        rear = null;
	    }

	    return val;
	}
	int deleteAtEnd() {
	    if (rear == null) {
	        return;
	    }

	    int val = rear.data;
	    rear = rear.prev;

	    if (rear != null) {
	        rear.next = null;
	    } else {
	        // deque became empty
	        front = null;
	    }

	    return val;
	}
}
