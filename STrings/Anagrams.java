package STrings;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "SAI";
        String str2 = "IAS";

        int[] freq = new int[26];
         
        if(str1.length() != str2.length()) {
            System.out.println("not anagrams");
        }
        for(int i = 0; i < str1.length();i++){
            freq[str1.charAt(i) - 'A']++;
        }
        for(int i = 0; i < str2.length();i++){
            freq[str1.charAt(i) - 'A']--;
        }

        for(int i = 0; i < 26; i++){
            if(freq[i] != 0){
                System.out.println("not anagrams");
                return;
            }
        }
        System.out.println("anagrams");
    }
}
