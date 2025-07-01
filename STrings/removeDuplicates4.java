package STrings;

public class removeDuplicates4 {
    public static void main(String[] args) {
        String str = "saikumar";
        // String str2 = "kumar";
        // boolean[] freq = new boolean[26];
        // String ans = "";
        // for(int i = 0; i < str.length();i++){
        //     if(freq[str.charAt(i) - 'a'] == false){
        //         ans += str.charAt(i);
        //         freq[str.charAt(i) - 'a'] = true;
        //     }
        // }
        // System.out.println(ans);

        // int[] freq = new int[26];
        // for(int i = 0; i < str.length();i++){
        //     freq[str.charAt(i) - 'a']++;
        // }
        // for(int j = 0; j < str2.length();j++){
        //     freq[str2.charAt(j) - 'a']--;
        // }
        // for(int i = 0; i < 26;i++){
        //     if(freq[i] >= 1){
        //         System.out.print((char)(i + 'a'));
        //     }
           
        // }

        StringBuilder result = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                char newChar = (ch == 'z') ? 'a' : (char)(ch + 1);
                result.append(newChar);
            }else{
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}
