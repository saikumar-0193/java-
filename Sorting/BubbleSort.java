package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,6,5,7,8,1,2,16};
        System.out.println("before sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }
        
            for(int j = 0; j < arr.length - 1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }       
        System.out.println();
        System.out.println("after sorting");
        for(int num : arr){
            System.out.print(num + " ");
        }



    }
}
