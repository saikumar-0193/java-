package STrings;

public class maxOccuringCharacter {
    public static void main(String[] args) {
        String name = "saikumarrrreddy";
        int[] freq = new int[26];

        for(int i = 0; i < name.length();i++){
            // char ch = name.charAt(i);
            freq[name.charAt(i) - 'a']++;
        }
        int maxFreq = 0;
        char maxChar = ' ';
        for(int i = 0; i < 26;i++){
            // if(freq[i] != 0){
            //     System.out.println((char)(i + 'a') + " " + freq[i]);
            // }
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                maxChar =(char) (i + 'a');
            }

        }
        System.out.println(maxChar + " " + maxFreq);
    }
}
