package Recursion;
import java.util.Scanner;
public class Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int result =  fun(n);
       System.out.println(result);
    }
    static int fun(int n) {
        if(n == 0) return 0;
        return n + fun(n-1);
        
    }
}
