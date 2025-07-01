public class secondLargest {
    public static void main(String[] args) {
        int arr[] = {2,3,4,50,5,7,10,25};
        int largest = arr[0];
        int seondlargest = -Integer.MAX_VALUE;
        for(int i = 1; i < arr.length;i++){
            if(arr[i] > largest){
                seondlargest = largest;
                largest = arr[i];
            }else if( arr[i] < largest && arr[i] > seondlargest){
                 seondlargest = arr[i];
            }
        }
        System.out.println(seondlargest);
    }
}
