public class binarySearch {
    public static void main(String[] args) {
        int[] arr = { 1,2,4,5,6,7,8,10,50,100};
        int target = 10;
        int n = arr.length - 1;
        int start = arr[0];
        int end = n;

        while (start < end) {
            int mid = (start + end) / 2;
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid] > target){
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
            
        }
    }
}
