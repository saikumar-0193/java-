package Recursion;

public class Factorial {
    public static void main(String[] args) {
      int start = 5;
      int end = 10;
      System.out.println(sum(start, end));
    }
    static int sum(int start, int end){
        if(end > start){
            return end + sum(start,end - 1);
        } else {
            return 0;
        }
    }
}
