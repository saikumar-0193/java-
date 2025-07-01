package Recursion;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SubsetSum2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        HashSet<List<Integer>>set  = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        Helper(0, arr, new ArrayList<>(), result);

        for (List<Integer> subset : result) {
            set.add(subset);
        }
        for(List<Integer> sub : set) {
            System.out.print(sub + " ");
        }
    }

    public static void Helper(int index, int[] arr, List<Integer> current, List<List<Integer>> result) {
        if (index == arr.length) {
            result.add(new ArrayList<>(current)); // add a copy of current subset
            return;
        }

        // Include current element
        current.add(arr[index]);
        Helper(index + 1, arr, current, result);

        // Backtrack and exclude the element
        current.remove(current.size() - 1);
        Helper(index + 1, arr, current, result);
    }
}
