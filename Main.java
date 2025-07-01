import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] arr = { 10, 9,55,3,35,44};
        int n = arr.length;
        Arrays.sort(arr);
        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[i] + " ");
        }
        for(int i = n - 1; i >= n /2 ; i-- ){
            System.out.print(arr[i] + " ");
        }
    }
}