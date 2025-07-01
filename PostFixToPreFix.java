import java.util.Stack;

public class PostFixToPreFix {
    public static void main(String[] args) {
        String s = "AB+C*";
        Stack<String> stack = new Stack<>();
        int i = 0;
        int n = s.length();
        while(i < n) {
            char ch = s.charAt(i);
            if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) {
                stack.push(String.valueOf(ch));
            }else {
                String s1 = stack.pop();
                String s2 = stack.pop();
                String modified = ch + s2 + s1;
                stack.push(modified);
            }
            i++;
        }
        System.out.println(stack.peek());
    }
}
