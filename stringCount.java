public class stringCount {
//     public static void main(String[] args) {
//         String name = "saikumarreddy";

//         HashMap<Character,Integer> map = new HashMap<>();
//         for(char c : name.toCharArray()){
//             map.put(c,map.getOrDefault(c, 0)+1);
//         }
//         for(Map.Entry<Character,Integer> entry : map.entrySet()){
//             if(entry.getValue() > 1){
//                 System.out.println(entry.getKey() + "-" + entry.getValue());
//             }
//         }
//     }
    public static void main(String[] args) {
        String name = "ssssaaiiiiiiikumar";
        int []counts = new int[26];

        for(int i = 0; i < name.length();i++){
            counts[name.charAt(i) - 'a']++;
            
        }
        for(int i = 0; i < 26; i++){
            if(counts[i] >= 1){
                System.out.println((char)(i + 'a') +":"+counts[i]);
            }
        }

    }

}





