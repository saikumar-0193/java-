import java.util.Arrays;
public class arrayRev {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 24, 50, 77};

        int first = 0;
        int last = arr.length-1;

        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
        first++;
        last--;
        System.out.println(Arrays.toString(arr));
    }
}
