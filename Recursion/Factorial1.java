package Recursion;

public class Factorial1 {
    public static void main(String[] args) {
        int n = 5;
        int fact = 1;
        Helper(n, fact);
    }
    public static void Helper(int n, int fact) {
        if(n == 1) {
            System.out.println(fact);
            return;
        }
        Helper(n - 1, fact * n);
    }
}
