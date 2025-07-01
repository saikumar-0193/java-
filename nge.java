import java.util.Stack;

public class nge {
    public static void main(String[] args) {
        int[] arr = {4,5,2,7,8};
        int[] nextGreater = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = arr.length-1; i >= 0; i--){
            if(!stack.isEmpty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            
            if(stack.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = stack.peek();
            }

            stack.push(arr[i]);
        }  
          for(int i = 0; i < nextGreater.length;i++){
            System.out.println(nextGreater[i]);
        }
      
    }
}
