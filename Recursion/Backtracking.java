package Recursion;
import java.util.Scanner;
public class Backtracking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n,n);
    }
    static void print(int i, int n) {
        if(i < 1) {
            return;
        }
        print(i-1,n);
        System.out.print(i + " ");
    }
}
