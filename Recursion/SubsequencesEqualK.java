package Recursion;
import java.util.ArrayList;
public class SubsequencesEqualK {
    public static void main(String[] args) {
        int[] arr = {1,4,5,9,10,8};
        int k = 9;
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;
        Helper(0,result,arr,sum,k);
    }
    static void Helper(int index, ArrayList<Integer>result, int[]arr,int sum, int k) {
        // boolean flag = false;
        if(index == arr.length ) {
            if(sum == k) {
                // flag = true;
                System.out.println(result);
            }
            return;
        }
        result.add(arr[index]);
        sum += arr[index];
        Helper(index+1, result, arr,sum,k);
        sum -= arr[index];
        result.remove(result.size()-1);
        Helper(index+1, result,arr,sum,k);

    }
}
