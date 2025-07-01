package Recursion;
import java.util.ArrayList;

public class CombinationalSum1 {
    public static void main(String[] args) {
        int[] arr = {1,5,6,3,9};
        int target = 6;
        ArrayList<Integer> result = new ArrayList<>();
        Helper(0,target,arr,result);
    }
    public static void Helper(int index, int target, int[]arr, ArrayList<Integer>result) {
        
            if(target == 0) {
                System.out.println(result);
                return;
            }
            if(index >= arr.length || target < 0) {
                return;
            }
        
        result.add(arr[index]);
        Helper(index, target - arr[index], arr,result);
        result.remove(result.size()-1);
        
        Helper(index+1, target , arr,result);
    }
}
