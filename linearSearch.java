public class linearSearch {
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,7};
        int target = 5;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("The element is found at index : " + i);
            }
        }
    }
}
