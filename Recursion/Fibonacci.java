package Recursion;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(print(5));

    }
    static int print(int n) {
        if(n <= 1) return n;
        return print(n-1) + print(n-2);
    }
}
