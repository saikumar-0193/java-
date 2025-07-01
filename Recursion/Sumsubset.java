package Recursion;
import java.util.ArrayList;
public class Sumsubset {
    public static void main(String[]args) {
        int[]arr = {1,3,2};
        ArrayList<Integer> list = new ArrayList<>();
        Helper(0, 0, arr, list);
    }
    public static void Helper(int index, int sum, int[]arr, ArrayList<Integer>result) {
        if(index == arr.length) {
            System.out.print( sum + " ")  ;
            return;
        }
        Helper(index+1, sum+arr[index], arr, result);
        Helper(index+1, sum, arr, result);
    }
}
