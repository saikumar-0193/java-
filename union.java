import java.util.ArrayList;
import java.util.HashSet;

public class union {
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        
        // Get the size of each array
        int n = arr1.length;
        int m = arr2.length;

        // Call the union method
        ArrayList<Integer> unionResult = unionOfArrays(arr1, arr2, n, m);

        // Print the result
        System.out.println("Union of the two arrays: " + unionResult);
    }
    public static ArrayList<Integer> unionOfArrays(int[] arr1, int[] arr2, int n, int m){
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();

        for(int i = 0; i < n; i++){
            set.add(arr1[i]);
        }
        for(int j = 0; j < m; j++){
            set.add(arr2[j]);
        }
        for(int it : set ){
            union.add(it);
        }
        return union;
    }
}
