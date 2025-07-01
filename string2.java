import java.util.HashMap;

public class string2 {
    public static void main(String[] args) {
        String name = "abbscderd";
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0;
        int maxsum = 0;
        for(int right = 0; right < name.length();right++){
            char currentChar = name.charAt(right);

            if(map.containsKey(currentChar)){
                left = Math.max(map.get(currentChar) + 1, left);
            }

            map.put(currentChar,right);
            maxsum = Math.max(maxsum,right-left+1);

        }
        System.out.println();
    }
}
