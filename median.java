import java.util.Arrays;

public class median {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        int n = 4;
        median(arr, n);
    }

    public static void median(int[] arr, int n){
        Arrays.sort(arr);
        if(n % 2 == 0){
            int first = ( n/ 2) - 1;
            int second = ( n / 2);
            System.out.println((double)(arr[first] + arr[second]) / 2);
        }
        else{
            System.out.println(arr[n / 2]);
        }
    }
}
