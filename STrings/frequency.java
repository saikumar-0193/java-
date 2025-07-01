package STrings;

public class frequency {
    public static void main(String[] args) {
        String name = "saikumarreddy";
        // HashMap<Character, Integer> map = new HashMap<>();

        // for(int i = 0; i < name.length();i++){
        //     char ch = name.charAt(i);
        //     map.put(ch, map.getOrDefault(ch,0)+1);
        // }

        // // for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
        // //     System.out.println(entry.getKey() + " -> " + entry.getValue());
        // // }

        // for(Character key : map.keySet()){
        //     System.out.println(key + " " + map.get(key));
        // }



        int[] freq = new int[26];
        for(int i = 0; i < name.length(); i++){
            freq[name.charAt(i) - 'a']++;  
        }
        for(int i = 0; i < 26; i++){
            if(freq[i]  == 1){
                System.out.println( (char)(i + 'a')    + "  "  + freq[i]);
            }
        }
    }
}
