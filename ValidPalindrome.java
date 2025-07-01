public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "saiass";
        int left = 0;
        int right = s.length()-1;
        while(left < right) {
            if(!Character.isLetterOrDigit(s.charAt(left))) {
                left++;

            }
            else if(!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            else if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                System.out.print("false");
                return;
            }
            else {
                left++;
                right--;
                
            }
        }
        System.out.println("true");
    }
}
