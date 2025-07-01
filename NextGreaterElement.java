import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums = {2,34,6,77,99,1};
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[nums.length];
        for(int i = nums.length - 1; i >= 0; i--) {
            while(!stack.isEmpty() && nums[stack.peek()] <= nums[i]) {
                stack.pop();
            }
            result[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
