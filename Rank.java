import java.util.ArrayList;
import java.util.List;

public class Rank {
    public static void main(String[] args) {
        int[] arr = {0,0,1,0};
        List<Integer> result = new ArrayList<>();
        for(int i = 1; i <= arr.length; i++) {
            result.add(i);
        }
        int[] arr1 = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            arr1[i] = result.get(arr[i]);
            result.remove(arr[i]);
        }
        for(int num : arr1) {
            System.out.print(num + " ");
        }
    }
}
