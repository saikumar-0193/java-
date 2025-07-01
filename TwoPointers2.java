public class TwoPointers2 {
    public static void main(String[] args) {
        int[] arr = {10,10,20,2,3,4,10,10};
        int k = 4;
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < k; i++) {
            sum  = sum + arr[i];
        }
        maxSum = sum;
        int rightIndex = arr.length - 1;
        for(int i = k-1; i >= 0; i--) {
            sum = sum - arr[i];
            sum = sum + arr[rightIndex];
            rightIndex--;
            maxSum = Math.max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
