import java.util.ArrayList;

public class FindingFirstAndLast {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,5,7,8,9,6,7,9};
        int target = 10;
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                result.add(i);
                break;
            }
        }
        for(int j = arr.length - 1; j >= 0; j--) {
            if(arr[j] == target) {
                result.add(j);
                break;
            }
        }
        for(int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }

    }
}
