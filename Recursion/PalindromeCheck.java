package Recursion;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "racecar";
       System.out.println(isPalindrome(str, 0, str.length()-1)) ;
    }
    public static boolean isPalindrome(String str, int start, int end) {
        if(start <= end) {
            return true;
        }
        if(str.charAt(start) != str.charAt(end)) {
            return false;
        }

        isPalindrome(str, start +1, end-1);
        return true;
    }
}
