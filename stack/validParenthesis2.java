package stack;

import java.util.Stack;

public class validParenthesis2 {
    public static void main(String[] args) {
         String name = "{([()])}";
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < name.length();i++){
            char ch = name.charAt(i);
            if(ch == '{' || ch == '(' || ch == '['){
                stack.push(ch);
            }
            else if(ch == '}' || ch == ')' || ch == ']'){
                if(stack.isEmpty()){
                    System.out.println("not valid");
                }

                char top = stack.pop();

                if((ch == '(' && top != ')') || (ch == '{' && top != '}') || (ch != '[' && top == ']') ){
                    System.out.println("not valid parenthesis");
                }
            }

           
        }
        System.out.println("valid");
    }
}
