package Stack;
import java.util.Stack;

public class deleteConsecutive {

	    public static String removeDuplicates(String s) {

	        Stack<Character> stack = new Stack<>();

	        for (char ch : s.toCharArray()) {

	            if (!stack.isEmpty() && stack.peek() == ch) {
	                stack.pop(); // remove duplicate
	            } 
	            else {
	                stack.push(ch);
	            }
	        }

	        String result = "";

	        for (char c : stack) {
	            result += c;
	        }

	        return result;
	    }

	    public static void main(String[] args) {

	        String str = "abbaca";

	        System.out.println(removeDuplicates(str));
	    }
	}

