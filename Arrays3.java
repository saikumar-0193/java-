public class Arrays3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4};
        int k = 6;
        int maxSum = 0, sum = 0;
        int left = 0, start = 0, end = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            // Shrink the window until the sum is <= k
            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            // Update maxSum and track subarray indices
            if (right - left + 1 > maxSum) {
                maxSum = right - left + 1;
                start = left;
                end = right;
            }
        }

        // Print the results
        System.out.println("Maximum subarray length: " + maxSum);
        System.out.print("Subarray: [");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + (i < end ? ", " : ""));
        }
        System.out.println("]");
    }
}
