public class twoPointersBetter {
    public static void main(String[] args) {
        int[] arr = {2,3,55,6,4,1,2,1};
        int k = 15;
        int l = 0;
        int r = 0;
        int sum = 0;
        int maxLen = 0;
        while(r < arr.length) {
            sum = sum + arr[r];

            while(sum <= k) {
                maxLen = Math.max(maxLen, r - l + 1);
                r++;
            } 

            while(sum > k) {
                sum = sum - arr[l];
                l++;
            }
           
        }
        System.out.println(maxLen);
    }
}
