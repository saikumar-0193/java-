public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] ans = new int[arr.length];
        for(int i = arr.length-1; i>= 0; i--){
            ans[arr.length - i - 1] = arr[i];
        }
        
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
