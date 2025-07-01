package Recursion;
import java.util.ArrayList;
import java.util.List;
public class SubSetsum1 {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        List<Integer> result = new ArrayList<>();
        Helper(0, arr, 0, result);
        for(int num : result) {
            System.out.print(num + " ");
        }
    }
    public static void Helper(int index, int[]arr, int sum, List<Integer>result) {
        if(index >= arr.length) {
            result.add(sum);
            return;
        }
        Helper(index+1, arr, sum + arr[index], result);
        Helper(index+1, arr, sum, result);
        
    }
}
