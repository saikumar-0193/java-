package STrings;

public class largestWOrd {
    public static void main(String[] args) {
        String  s = "my name is sai";
        String[] words = s.split(" ");
        String largestWord = "";
        for(String word : words){
            if(word.length() > largestWord.length()){
                largestWord = word;
            }
        }
        System.out.println(largestWord);
    }
}
