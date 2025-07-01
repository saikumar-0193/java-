public class small {
    public static void main(String[] args) {
       int[] arr1 = {100, 200, 5, 900};
       int n = arr1.length;
      getElements(arr1, n);
    }

    public static void getElements(int[] arr, int n){
        int small = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            small = Math.min(small, arr[i]);
            largest = Math.max(largest , arr[i]);
        }
        for(int i = 0 ; i < n; i++){
            if (arr[i] < secondSmallest && arr[i] != small ){
                secondSmallest = arr[i];
            }
            if(arr[i] > secondLargest && arr[i] != largest){
                 secondLargest = arr[i];
            }
           
        }
        System.out.println("second Largest Element is " + secondLargest);
        System.out.println("second Smallest Element is " + secondSmallest);
        
    }
    

}
