import java.util.Stack;

public class NextSmallerElement {
    public static void main(String[] args) {
        int[] nums = {2,1,5,6,2,3};
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];
        for(int i = nums.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && nums[stack.peek()] >= nums[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? nums.length : stack.peek();
            stack.push(i);
        }
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");

        }
    }
}
