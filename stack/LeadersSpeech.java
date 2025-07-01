package stack;
import java.util.Scanner;
import java.util.Stack;
public class LeadersSpeech {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Stack<Character> stack = new Stack<>();
        for(char ch : str.toCharArray()) {
            if(ch == '+') {
                stack.push(ch);
            } else {
                if(ch == '-' && !stack.isEmpty()) {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()) {
            System.out.println("yes");
        }else {
            System.out.println("No");
        }
    }
}
