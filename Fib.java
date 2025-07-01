public class Fib {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        for(int i = 2; i < 10; i++) {
              int sum = first + second;
              System.out.print(sum + " ");
              first = second;
              second  = sum;
        }
    }
}
