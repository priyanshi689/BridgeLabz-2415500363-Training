class Node{
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class circularQueueusingLinkedLIst { 
    Node rear;
    Node front;
    void enque(int val) {
        Node newnode = new Node(val);
        if(front == null) {
            front = newnode;
            rear = newnode;
            rear.next = front;
            return;
        }
        rear.next = newnode;
        rear = newnode;
        rear.next = front; 
    }
        void deque(int val){
        if(front == null) {
            System.out.println("Queue is empty");
            return;
        }
        if(front==null) {
            rear = null;
            front = null;
        }
            front  = front.next;
            rear.next = front;
    }
    void display() {
        if(front == null) {
            System.out.println("Queue is empty");
            return;
        }

        if(front == rear) {
            System.out.println(front.data);
            return;
        }
        Node temp = front;
        do {
            System.out.print(temp.data);
            temp = temp.next;
        } while(temp != front);
        System.out.println();
    }  
    public static void main(String[] args) {
        circularQueueusingLinkedLIst queue = new circularQueueusingLinkedLIst();
        queue.enque(10);
        queue.enque(20);
        queue.enque(30);
        queue.display();

        queue.deque(10);
        queue.display();

        queue.deque(20);
        queue.display();

        queue.deque(30);
        queue.display();
    }
    
}
