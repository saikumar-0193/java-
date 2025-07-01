package Recursion;

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 5;
        int result = fib(n);
        System.out.println(result);
    }
    public static int fib(int n) {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }
}
