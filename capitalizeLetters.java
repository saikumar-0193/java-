public class capitalizeLetters {
    public static void main(String[] args) {
        String name = "my name is sai";
        StringBuilder result = new StringBuilder();
        String[] words = name.split(" ");
         for(String word : words){
            if(word.length()==1){
                result.append(Character.toUpperCase(word.charAt(0)));
            }else{
                result.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1, word.length()-1))
                .append(Character.toUpperCase(word.charAt(word.length()-1)));
            }
            result.append(" ");
         }
        System.out.println(result.toString());
    }
}
