package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3,4,1,7,8,2,5};
        int n = arr.length;
        int minIndex = -1;
        for(int i = 0; i < n;i++){
             minIndex = i;
             for(int j = i+1; j < n;j++){

                if(arr[minIndex] > arr[j])
                  minIndex = j;
             }
             int temp = arr[minIndex];
             arr[minIndex] = arr[i];
             arr[i] = temp;
        }
        for(int nums : arr){
            System.out.print(nums + " ");
        }
    }
}
