import java.util.Arrays;

public class CountFrequency {
    public static void main(String[] args) {
        int[] arr = {3,6,7,44,89,1};
        Arrays.sort(arr);
        for(int i = 0; i < arr.length / 2 ; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i = arr.length-1; i >= arr.length / 2 ; i--){
            System.out.print(arr[i] + " ");
        }
    }
}
