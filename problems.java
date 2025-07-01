import java.util.HashMap;

public class problems{
    public static void main(String[] args){
        // int array[] = { 2,7,12,15};
        // for(int i = 0; i < array.length; i++){
        //     for(int j = i+1; j < array.length; j++){
        //         if(array[i] + array[j] == 9){
        //            System.out.println(array[i] +"," + array[j]);
        //         }
        //     }
        // }
        int []array = { 3,4,7,15};
        int target = 9;
        findPairs(array, target);
    }
    public static int findPairs(int[] array, int target){
        HashMap <Integer,Integer> map = new HashMap<>();

        int currentSum = 0;
        int maxLength = 0;

        for(int i = 0; i < array.length; i++){
            currentSum += array[i];

            if(currentSum == target){
                maxLength = i+1;
            }
            if(map.containsKey(currentSum-target)){
                int subArrayLength = i - map.
            }
        }

        
    }
}