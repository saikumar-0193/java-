package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsequence {
    public static void main(String[] args) {
        String input = "abc";
        List<List<String>> list = new ArrayList<>();
        List<String> sub = new ArrayList<>();
        Helper(input, 0, sub, list);
    }
    public static void Helper(String input, int index, List<String> sub, List<List<String>> list) {
        if(index >= input.length()) {
            System.out.println(sub);
            return;
        }
        sub.add(String.valueOf(input.charAt(index)));
        Helper(input, index + 1, sub, list);
        sub.remove(sub.size()-1);
        Helper(input, index+1, sub, list);
    }
}
