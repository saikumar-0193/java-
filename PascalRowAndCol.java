public class PascalRowAndCol {
    public static void main(String[] args) {
        long n = 5;
        long r = 3;
        System.out.println(FindNcR(n-1, r-1));
    }
    public static long FindNcR(long n, long r) {
        long res = 1;
        for(int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
}
