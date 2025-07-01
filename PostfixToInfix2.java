import java.util.Stack;

public class PostfixToInfix2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String exp = "abc^d+*";
        int n = exp.length();
        int i = 0;
        while(i < n) {
            char ch  = exp.charAt(i);
            if((ch <= 'Z' && ch >= 'A') ||(ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                stack.push(String.valueOf(ch));
            } else {
                String ch2 = stack.pop();
                String ch1 = stack.pop();
                String modified = "(" + ch1 + ch + ch2 + ")";
                stack.push(modified);
            }
            i++;
        }
        System.out.println(stack.peek());
    }
}
