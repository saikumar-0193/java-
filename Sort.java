public class Sort {
    public static void main(String[] args) {
        String str = "bsaaaai";
        int[] freq = new int[26];
        for(int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;   
            
        }
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < 26; i++) {
            while(freq[i] > 0) {
                result.append((char)(i + 'a'));
                freq[i]--;
            }
        }
       System.out.println(result.toString());
    }
}
