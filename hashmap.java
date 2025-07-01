import java.util.Arrays;
public class hashmap{
    public static void main(String[] args) {
        int[] array1 = {1,3,5};
        int[] array2 = {2, 5, 9};
        int[] merged = median(array1, array2);
        System.out.println(Arrays.toString(merged));
    }

    public static int[] median(int[]arr1, int[]arr2){
        int n = arr1.length;
        int m = arr2.length;
        int k = 0;
        int merged[] = new int[n + m];
        for (int i = 0 ; i < n; i++){
            merged[k++] = arr1[i];
        }
        for (int j = 0 ; j < m; j++){
            merged[k++] = arr2[j];
        }

        Arrays.sort(merged);
        return merged;
    }
    
}
