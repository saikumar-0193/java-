package Recursion;
public class Example2 {
    public static void main(String[] args) {
        fact(2);
    }

    public static void fact(int n){
        if(n > 0) {
            System.out.println("calling : " + n);
            fact(n - 1);
            System.out.println("returning : " + n);
        }
    }
}
