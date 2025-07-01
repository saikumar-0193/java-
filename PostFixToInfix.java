import java.util.Stack;

public class PostFixToInfix {
    public static void main(String[] args) {
        String s = "abc^d-*";
        Stack<String> stack = new Stack<>();
        int i = 0;
        int n = s.length();
        while(i < n) {
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'Z')|| (ch >= 'a' && ch <= 'z' ) || (ch >= '0' && ch <= '9')) {
                stack.push(String.valueOf(ch));
            } else {
                String t1 = stack.pop();
                String t2 = stack.pop();
                String modified = "(" + t2 + ch + t1 + ")";
                stack.push(modified);
            }
            i++;
        }
        System.out.println(stack.peek());
    }
}
