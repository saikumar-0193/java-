import java.util.HashSet;

public class RemoveCharacters {
    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "bdf";
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < str1.length();i++) {
            set.add(str1.charAt(i));

            for(int j = 0; j < str2.length(); j++) {
                if(set.contains(str2.charAt(j))) {
                    set.remove(str2.charAt(j));
                }
            }
        }
        for(char c : set) {
            System.out.print(c + " ");
        }
    }
}
