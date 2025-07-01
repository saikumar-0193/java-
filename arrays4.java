public class arrays4{
    public static void main(String[] args){
        int[] arr = {7,8,1,1,6,7,9,1};
        int k = 4;
        int   maxSum = 0, lsum = 0;
        for(int i = 0; i < k ; i++ ){
            lsum = lsum + arr[i];
            maxSum = lsum;

        }
        int rsum = 0;
        int rindex= arr.length-1;
        for(int i = k-1; i >= 0; i--){
           lsum = lsum - arr[i];
           rsum = rsum + arr[rindex];
           rindex--;
           maxSum = Math.max(maxSum, lsum + rsum);
        }
        System.out.println(maxSum);
    }
}