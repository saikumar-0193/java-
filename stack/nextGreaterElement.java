package stack;

import java.util.Stack;

public class nextGreaterElement {
    public static void main(String[] args) {
        int arr[] = {1,5,6,7,2,9,8};
        System.out.println(NGE(arr));
    }
    public static int[] NGE(int[] arr){

        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for(int i = n-1; i >= 0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i] ){
                stack.pop();
            }
            if(!stack.isEmpty()){
                result[i] = stack.peek();
            }
            else{
                result[i] = -1;
            }
            stack.push(arr[i]);
        }

        return result;
        }
    
}
