import java.util.Arrays;

public class MoveZeroes1 {
    public static void main(String[] args) {
        int[]  arr = {1,4,5,7,0,7,0,0,9};
        int insertPosition = arr.length - 1 ;
        for(int i = arr.length - 1 ; i >= 0; i--) {
            if(arr[i] != 0) {
                arr[insertPosition--] = arr[i];
            }
        }
         while(insertPosition >= 0) {
            arr[insertPosition] = 0;
            insertPosition--;
         }
         System.out.println(Arrays.toString(arr));
    }
}
