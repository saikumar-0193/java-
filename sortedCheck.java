public class sortedCheck {
    public static void main(String[] args) {
        int[]arr = { 1,2,3,4,5,5,6,77,77};
        boolean isSorted = true;
        for(int  i = 0; i < arr.length-1; i++){
            if(arr[i] >= arr[i+1]){
                isSorted = true;
            }
        }
        if(isSorted == true){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
