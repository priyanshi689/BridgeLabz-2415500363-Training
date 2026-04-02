package Stack;

//Stack implementation using array with resizing
class Stack {
 private int[] arr;
 private int top;
 private int capacity;

 // Constructor to initialize the stack
 public Stack(int size) {
     arr = new int[size];
     capacity = size;
     top = -1;
 }

 // Add an element to the stack
 public void push(int x) {
     if (isFull()) {
         resize(capacity * 2);   // increase size when full
     }
     arr[++top] = x;
     System.out.println("Pushed: " + x);
 }

 // Remove the top element
 public int pop() {
     if (isEmpty()) {
         System.out.println("Stack Underflow!");
         return -1;
     }

     int value = arr[top--];

     // Shrink stack if elements are less than 25%
     if (top + 1 > 0 && top + 1 <= capacity / 4) {
         resize(capacity / 2);
     }

     return value;
 }

 // Resize method
 private void resize(int newCapacity) {
     int[] newArr = new int[newCapacity];

     for (int i = 0; i <= top; i++) {
         newArr[i] = arr[i];
     }

     arr = newArr;
     capacity = newCapacity;

     System.out.println("Stack resized to: " + capacity);
 }

 // Return the top element without removing it
 public int peek() {
     if (!isEmpty()) {
         return arr[top];
     }
     return -1;
 }

 public boolean isEmpty() {
     return top == -1;
 }

 public boolean isFull() {
     return top == capacity - 1;
 }
 
}
