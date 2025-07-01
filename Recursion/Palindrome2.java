package Recursion;

public class Palindrome2 {
    public static void main(String[] args) {
        String str = "saisdas";
        int left = 0;
        int right = str.length()-1;
        System.out.println(isPalindrome(str,left,right));
    }
    static boolean isPalindrome(String str, int left1, int righ1) {
        if(left1 >= righ1) {
            return false;
        }

        if(str.charAt(left1) != str.charAt(righ1)) {
            return false;
        }
        return isPalindrome(str, left1+1, righ1-1);
        
    }
}
