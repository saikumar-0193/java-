import java.util.ArrayList;
import java.util.Collections;

public class Leaders {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2}; //17,5,2
        ArrayList<Integer> result = new ArrayList<>();
        int max = arr[arr.length - 1];
        result.add(max);
        for(int i = arr.length - 2; i>= 0; i--) {    
            if(arr[i] > max) {
                max = arr[i];
                result.add(max);
            }
        }
        for(int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        Collections.reverse(result);
        System.out.println(result);
    }
    

}
