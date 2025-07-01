
public class MaxSum {
    public static void main(String[] args) {
        int arr[] = {4,5,10,6,7,9,34,55};
        int k = 4;
        int sum = 0;
        int maxSum = 0;
        for(int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        maxSum = sum;
        int left = 0;
        int right = k;
        while  (right < arr.length) {
            sum = sum - arr[left];
            left++;
            sum = sum + arr[right];
            right++;
            maxSum = Math.max(maxSum, sum);
        }

        System.out.println(maxSum);
    }
}
