public class GenerateSubstrings {
    public static void main(String[] args) {
        String s = "aabcb";
        int totalBeauty = 0;
        for(int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            for(int j = i; j < s.length(); j++) {
                // System.out.println(s.substring(i, j+1));
                freq[s.charAt(j) - 'a']++;
                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                for(int f : freq) {
                    if(f > 0) {
                        maxFreq = Math.max(maxFreq,f);
                        minFreq = Math.min(minFreq,f);
                    }
                }
                totalBeauty += (maxFreq - minFreq);
            }
        }
        System.out.println(totalBeauty);
    }
}