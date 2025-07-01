import java.util.Stack;
public class Braces {
    public static void main(String[] args) {
        String str = "(()())((()))";
        Stack<Character> stack = new Stack<>();
        int count = 0;
       
        for(char c : str.toCharArray()) {
            if(c == ')' && stack.isEmpty()) {
                stack.push(c);
            }
            if(c == '(') {
                stack.push(c);
            } else if(c == ')' && !stack.isEmpty()) {
                stack.pop();
                count += 2;
                length++;
            }
        }
        System.out.println(count );
    }
}
