package Recursion;
import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n,0);
    }
    static void print(int i, int sum) {
        
        if (i < 1) {
            System.out.println(sum);
            return;
        }
        print(i - 1, sum + i);
    }
}
