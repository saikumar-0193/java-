import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class threeSum {
    public static void main(String[] args) {
        int[] arr = {9,10,33,44,55,6,7};
        int target = 87;
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            int left = i + 1;
            int right = arr.length - 1;

            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == target) {
                    result.add(Arrays.asList(arr[i], arr[left], arr[right]));
                    // left++;
                    // right--;
                } else if(sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
            
        }
        for(List<Integer> num : result) {
            System.out.print(num + " ");
        }
    }
}
