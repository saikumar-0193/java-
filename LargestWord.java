public class LargestWord {
    public static void main(String[] args) {
        String s = "sai kumar redddyy";
        String largest = "";
        String[] words = s.split(" ");
        for(int i = 0; i < words.length; i++) {
            if(words[i].length() > largest.length()) {
                largest = words[i];
            }
        }
        System.out.println(largest);
    }
}
