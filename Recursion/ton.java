package Recursion;
import java.util.Scanner;
public class ton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n,1);
    }
    public static void print(int i, int n) {
        if (i < 1 ) return;
        System.out.print(i + " ");
        print(i-1, n);
    }
}
