import java.util.Stack;

public class InfixToPrefix {

    static int precedence(char ch) {
        if (ch == '+' || ch == '-') return 1;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '^') return 3;
        return -1;
    }

    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String convert(String exp) {

        exp = reverse(exp);

        // swap brackets
        exp = exp.replace('(', '#')
                 .replace(')', '(')
                 .replace('#', ')');

        String result = "";
        Stack<Character> stack = new Stack<>();

        for (char ch : exp.toCharArray()) {

            if (Character.isLetterOrDigit(ch)) {
                result += ch;
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            }
            else {
                while (!stack.isEmpty() && 
                       precedence(stack.peek()) > precedence(ch)) {
                    result += stack.pop();
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return reverse(result);
    }
}
