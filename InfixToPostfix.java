import java.util.Stack;

public class InfixToPostfix {
    public static int Priority(Character ch) {
        int priority = -1;
        if(ch == '^') {
            priority = 3;
        }else if( ch == '/' || ch == '*') {
            priority = 2;
        }else if(ch == '+' || ch == '-') {
            priority = 1;
        }
        return priority;
    }
    public static void main(String[] args) {
        String s = "a^b*(c^d-e)";
        String ans = "";
        int n = s.length();
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i < n) {
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') ||
            (ch >= '0' && ch <= '9') ) {
                ans = ans + ch;
            }
            else if(ch == '(') {
                stack.push(ch);
            } 
            else if(ch == ')') {
                while(!stack.empty() && stack.peek() != '(') {
                    ans = ans + stack.peek();
                    stack.pop();
                }
                stack.pop();
            }
            else {
                while(!stack.empty() && Priority(ch) <= Priority(stack.peek())) {
                    ans = ans + stack.peek();
                    stack.pop();
                }
                stack.push(ch);
            }
            i++;
        } 
        while(!stack.empty()) {
            ans = ans + stack.peek();
            stack.pop();
        }
        System.out.println(ans);
    }
}
