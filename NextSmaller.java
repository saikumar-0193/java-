import java.util.Stack;
public class NextSmaller {
    public static void main(String[] args) {
        int[] arr = {10,20,1,2,50,40,5};
        int[] nse = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            while(!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                nse[i] = -1;
            }else {
                nse[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        for(int i = 0; i < nse.length; i++) {
            System.out.print(nse[i] + " ");
        }
    }
}
