package Recursion;
import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        function(0,n);
    }
    public static void function(int i, int n) {
        if(i > n) return;
        System.out.println("sai");
        function(i+1, n);
    }
}
