public class LargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = {3,4,2,5,7,1,5,10};
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i - 1] && arr[i] < arr[i + 1]) {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
