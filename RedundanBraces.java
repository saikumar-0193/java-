import java.util.Stack;

java.util.Stack;
public class RedundanBraces {
    public static void main(String[] args) {
        String expression  = "((a + b))";
        Stack<Character> stack = new Stack<>();
        for(int i  = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if(ch == '(' || ch == '+' || ch == '-' || ch == '/' || ch == '%') {
                stack.push(ch);
            }
            if(ch == ')' && stack.peek() != '+' || stack.peek() != '-' || stack.peek() != '/' || stack.peek() != '%') {
                System.out.println(false);
                break;
            } else {
                System.out.println(true);
            }
        }
        
    }    
}
x