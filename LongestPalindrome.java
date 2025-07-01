public class LongestPalindrome {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        String name = "saiasaaaaaaas";
        for(int i = 0; i < name.length(); i++) {
            for(int j = i; j < name.length(); j++) {
                String sub = name.substring(i, j+1);
                if(isPlaindrome(sub)) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        System.out.println(max);
        
    }
    public static boolean isPlaindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while(i < j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
