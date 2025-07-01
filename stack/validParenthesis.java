package stack;

import java.util.Stack;

public class validParenthesis {
        public static void main(String[] args) { 
            
            String name = "([{])";
            System.out.println(validParenthesis1(name));
    }
    public static boolean validParenthesis1(String braces){
        Stack<Character> stack = new Stack<>();
        
              for(char c : braces.toCharArray()){
            if(c == '{' || c == '(' || c== '['){
                stack.push(c);
            }
            else if(c == ')' || c == '}' || c == ']'){
                if(stack.isEmpty()){
                    return false;
                }

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
