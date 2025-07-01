public class Reverse2 {
    public static void main(String[] args) {
        String str = "saikumar";
        char[] s = str.toCharArray();
        int l = 0;
        int r = str.length() - 1;
        while(l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        System.out.println(s);
    }
}
