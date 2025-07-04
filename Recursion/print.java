package Recursion;

public class print {
    public static void main(String[] args) {
        helper(5);
    }
    public static void helper(int num) {
        if(num <= 0) return;
         helper(num - 1);
        System.out.print(num + " ");
       
    }
}
