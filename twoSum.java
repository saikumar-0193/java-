import java.util.Arrays;
public class twoSum{
    public static void main(String[] args) {
        int arr[] = {1,6,3,10,11};
        int target = 9;
        twoSum a = new twoSum();
        int []result = a.toSum(arr, target);
        System.out.println(Arrays.toString(result));
    }
    public int[] toSum(int[]array, int target){
        for (int i = 0; i < array.length; i++) {
            for(int j = i + 1; j<array.length;j++){
                if(array[i] + array[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return array;
    }
    
}