package stack;

import java.util.Stack;

public class basicStack {
    public static void main(String[] args) {
        String name = "saikumar";
       Stack<Character> stack = new Stack<>();

       for(char words : name.toCharArray()) {
           stack.push(words);
       }

       StringBuilder reversed = new StringBuilder();
       while(!stack.isEmpty()){
            reversed.append(stack.pop());
       }
       System.out.println(reversed.toString());
    }
}
