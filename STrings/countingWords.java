package STrings;

import java.util.HashSet;

public class countingWords {
    public static void main(String[] args) {
        String str = "saikuamr";
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for(int right = 0; right < str.length();right++){
            char currentChar = str.charAt(right);


            while(set.contains(currentChar)){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(currentChar);
            maxLength = Math.max(maxLength,right-left+1);

        }
        System.out.println(maxLength);
    }
}
