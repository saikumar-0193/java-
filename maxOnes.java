public class maxOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,0,0,1,1,1};
        int k = 2;
        // int maxSum = 0;
        // int len = 0;
        // for(int i = 0; i < arr.length;i++){
        //     int zeroes = 0;
        //     for(int j = i; j < arr.length;j++){
        //         if(arr[j] == 0){
        //             zeroes++;
        //         }
        //         if(zeroes <= k){
        //            len = j-i+1;
        //            maxSum = Math.max(maxSum,len);
        //         }else{
        //             break;
        //         }
        //     }
        // }
        // System.out.println(maxSum);
        int left = 0;
        int zeroes = 0;
        int maxSum = 0;
        for(int i = 0; i < arr.length;i++){
            if(arr[i] == 0){
                zeroes++;
            }
            if(zeroes > k){
                if(arr[left] == 0){
                    zeroes--;
                }
                left++;
            }
            maxSum = Math.max(maxSum, i - left + 1);
        }
        System.out.println(maxSum);
    }
}
