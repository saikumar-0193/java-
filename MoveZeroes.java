public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {1,0,4,4,5,0,9,0};
        
        int nonZeroIndex = 0;
        for(int j = 0; j < arr.length; j++) {
            if(arr[j] != 0) {
                arr[nonZeroIndex] = arr[j];
                nonZeroIndex++;
            }
        }
        while(nonZeroIndex < arr.length) {
            arr[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
        for(int num : arr) {
            System.out.print(num+ " ");
        }
    }
}
