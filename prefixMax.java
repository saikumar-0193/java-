public class prefixMax {
    public static void main(String[] args) {
        System.out.println(helper(6));
    }
    public static int helper(int n) {
        if(n <= 0) return n;
        int num = helper(n-1);
        return num;
    }
}
