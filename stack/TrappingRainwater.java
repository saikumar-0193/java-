package stack;
public class TrappingRainwater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rainwater(arr));
    }

    static int rainwater(int[] arr){
        int n = arr.length;
        int trappedWater = 0;
        

       
        for(int i = 0; i < n ; i++){
            int leftMax = 0;
            int rightMax = 0;
            int j = i;
            while(j >= 0){
                leftMax = Math.max(leftMax, arr[j]);
                j--;
            }
            j = i;
            while(j < n){
                rightMax = Math.max(rightMax,arr[j]);
                j++;
            }
            trappedWater += Math.min(leftMax,rightMax) - arr[i];
        }

        return trappedWater;
    }
}
