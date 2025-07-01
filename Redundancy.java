import java.util.Stack;

public class Redundancy {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        String ch = "(a + b ())";
        
        for(char c : ch.toCharArray()) {
            if(c == ')') {
                boolean hasOperator = false;
                char top = stack.pop();
                 
                while(top != '(') {
                if(top == '+' || top == '-' || top == '/' || top == '*') {
                    hasOperator = true;
                    System.out.println("false");
                    break;
                }
                if (stack.isEmpty()) break;
                 top = stack.pop();
                }
                if(!hasOperator) {
                    System.out.println("true");
                }
                
            }else {
                stack.push(c);
            }
        }
        System.out.println("false");
    }
}
