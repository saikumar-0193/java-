package Recursion;
import java.util.ArrayList;
import java.util.List;
public class GenerateAllPermutations {
        public static void main(String[] args) {
            String str = "abc"; 
            List<String> result = new ArrayList<>();
            Helper(str,0, "", result);
           System.out.println(result.get(1));
    }
    public static void Helper(String str, int index, String current, List<String>result) {
        if(index >= str.length()) {
            result.add(current);
            return;
        }
        for(int i = 0; i < index; i++) {
        //
            Helper(str, i +1, current + str.charAt(i), result);
            Helper(str, index, current, result);
        }
    }
}
