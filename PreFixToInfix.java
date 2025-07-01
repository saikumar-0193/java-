import java.util.Stack;

public class PreFixToInfix {
    public static void main(String[] args) {
        String s = "*+AB-CD";
        Stack<String> stack = new Stack<>();
        
        int n = s.length();
        int i = n - 1;
        while(i >= 0) {
            char ch = s.charAt(i);
            if(( ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || ch >= '0' && ch <= '9') {
                stack.push(String.valueOf(ch));
            }else {
                String top1 = stack.pop();
                String top2 = stack.pop();
                String modified = "(" + top1 + ch + top2 + ")";
                stack.push(modified);
            }
            i--;
        }
        System.out.println(stack.peek());
    }
}
