public class implementQueuewithArray {
    int[] arr;
    int front;
    int rear;
    int capacity;

    implementQueuewithArray(int size) {
        arr = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Overflow");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return Integer.MIN_VALUE;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        return item;
    }

    boolean isFull() {
        return (rear + 1) % capacity == front;
    }

    boolean isEmpty() {
        return rear == -1;
    }
}
