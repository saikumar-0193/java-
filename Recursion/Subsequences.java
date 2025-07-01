package Recursion;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Subsequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int[] arr = {3,1,2};
        List<Integer> result = new ArrayList<>(); 
        printf(0,result,arr,n);
    }
    static void printf(int index, List<Integer> result, int[] arr, int n) {
        if (index == n) {
            System.out.println(result);
            return;
        }
        result.add(arr[index]);
        printf(index + 1, result, arr, n);
        result.remove(result.size() - 1);
        printf(index + 1, result, arr, n);
    }
}
