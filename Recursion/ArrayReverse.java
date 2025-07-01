package Recursion;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,2,1};
        int l = 0;
        int r = arr.length - 1;
        rev(arr,l, r);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void rev(int[]arr, int l, int r) {
        if(l >= r) return;
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;


        rev(arr,l+1,r-1);
    }
    
}
