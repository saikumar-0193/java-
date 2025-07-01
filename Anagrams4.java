public class Anagrams4 {
    public static void main(String[] args) {
        String str1 = "sai";
        String str2 = "ias";
        int[] freq = new int[26];
        for(int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < str2.length(); i++) {
            freq[str2.charAt(i) - 'a']--;
        }
        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0) {
                System.out.println("false");
            }
        }
        System.out.println("true");
    }
}
