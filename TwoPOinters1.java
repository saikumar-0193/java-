public class TwoPOinters1 {
    public static void main(String[] args) {
        int[] arr = {9,9,1,2,3,4,9,10};
        int k = 4;
        int lsum = 0;
        int maxSum = 0;
        int rsum = 0;
        for(int i = 0; i < k; i++) {
            lsum = lsum + arr[i];
        }
        maxSum  = lsum;
        int rindex = arr.length - 1;
        for(int i = k-1; i >= 0; i--) {
            lsum = lsum - arr[i];
            rsum = rsum + arr[rindex];
            rindex--;
            maxSum = Math.max(maxSum, lsum + rsum);
        }
        System.out.println(maxSum);
    }
}
