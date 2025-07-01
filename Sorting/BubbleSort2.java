package Sorting;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] arr = {3,1,55,66,33,20};
        int n = arr.length;

        for(int j = 0; j < n - 1; j++) {
            for(int i = 0; i < n - j - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i+1] = temp;
                }
            }
        }  
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
