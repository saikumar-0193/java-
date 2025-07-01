package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,6,7,1,2,9};
        int n = arr.length;
        for(int i = 1; i < n; i++){
            int j = i - 1;
            int key = arr[i];

            while(  j >= 0 &&arr[j] > key ){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        for(int nums : arr){
            System.out.print(nums + " ");
        }
    }
}
