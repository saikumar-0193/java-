package STrings;

public class PalindromM {
    public static void main(String[] args) {
        // String str = "saias";
        // boolean isPalindrome = false;
        // for(int i = 0; i < str.length() / 2; i++) {
        //     if(str.charAt(i) == str.charAt(str.length() - i - 1)) {
        //         isPalindrome = true;
        //         break;
        //     }
        // }
        // if(isPalindrome) {
        //     System.out.println("palindrome");
        // }else {
        //     System.out.println("not palindrome");
        // }

        // String name = "Asi";
        // char ch = name.charAt(0);
        // System.out.println((int) ch);

        // String sentence = "sai kumar reddy";
        // StringBuilder result = new StringBuilder();
        // for(int i = 0 ; i < sentence.length();i++) {
        //     char ch = sentence.charAt(i);
        //     if( ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' ) {
        //         result.append(ch);
        //     }
        // }
        // System.out.println(result);

        String name = "saikumar";
        StringBuilder reversed = new StringBuilder();
        for(int i = name.length() - 1; i >= 0; i--) {
            char ch = name.charAt(i);
            reversed.append(ch);
        }
        System.out.println(reversed);
    }
}
