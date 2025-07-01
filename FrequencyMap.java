public class FrequencyMap {
    public static void main(String[] args) {
        String s = "saikumar";
        // HashMap<Character,Integer> map = new HashMap<>();
        // for(char c : s.toCharArray()) {
        //     map.put(c,map.getOrDefault(c, 0) + 1);
        // }
        // for(var entry : map.entrySet()) {
        //     System.out.println(entry.getKey() + " : " + entry.getValue());
        // }
        int[] freq = new int[26];
        for(int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 26; i++) {
            if(freq[i] != 0) {
                System.out.print((char)(i + 'a'));
                System.out.print(freq[i] + " ");
            }
        }
    }
}
