package Recursion;

public class SumOfNumbers {
    public static void main(String[] args) {
        int n = 1234;
        int sum = 0;
        Helper(n,sum);
    }
    public static void Helper(int num, int sum) {
        if(num == 0) {
            System.out.println(sum);
            return;
        }
        Helper(num/10,sum + num % 10);
        
    }
}
