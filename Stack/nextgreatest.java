
package Stack;


	import java.util.Stack;

	public class nextGreatest {

	    public static void nextGreater(int arr[]) {

	        Stack<Integer> stack = new Stack<>();

	        for (int i = 0; i < arr.length; i++) {

	            while (!stack.isEmpty() && stack.peek() < arr[i]) {
	                System.out.println(stack.pop() + " -> " + arr[i]);
	            }

	            stack.push(arr[i]);
	        }

	        while (!stack.isEmpty()) {
	            System.out.println(stack.pop() + " -> -1");
	        }
	    }

	    public static void main(String[] args) {

	        int arr[] = {4, 5, 2, 25};

	        nextGreater(arr);
	    }
	}

