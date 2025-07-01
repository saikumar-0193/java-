import java.util.Stack;
public class PreviousGreaterEle {
    public static void main(String[] args) {
        int[] arr = {10,500,100,80,70,85,95,200};
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            while(!stack.empty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        for(int i = 0; i < result.length;i++) {
            System.out.print(result[i]  + " ");
        }
    }
}
