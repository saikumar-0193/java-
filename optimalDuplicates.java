public class optimalDuplicates {
    public static void main(String[] args) {
        int[] arr = {15, 1, 2, 3, 4, 4, 5, 6, 6, 7};
        int newLength = returnDuplicates(arr);
        
        System.out.println("Length of unique elements: " + newLength);
        System.out.print("Array without duplicates: ");
        for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + " ");
    }
}
    public static int returnDuplicates(int[]arr){
        if(arr.length == 0)    return 0;
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
        
    }
}
