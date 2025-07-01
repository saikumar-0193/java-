package Recursion;
import java.util.ArrayList;
public class SubsequencesCount {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 7;
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;
        System.out.println(Helper(0, 0, arr, k));
        
    }
    public static int Helper(int index, int sum, int[]arr, int k) {
        
        if(index == arr.length) {
            if(sum == k) {
                return 1;
            }
            return 0;
        }
       
       
        int lsum = Helper(index+1, sum+arr[index], arr, k);
        
       
        int rsum = Helper(index+1, sum, arr, k);
        return lsum + rsum;
    }
}
