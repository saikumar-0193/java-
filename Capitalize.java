public class Capitalize {
    public static void main(String[] args) {
        String str = "sai kumar reddy";
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < words.length; i++) {
            String word = words[i];
            if(word.length() == 1) {
                result.append(word.toUpperCase().charAt(0));
            } else {
                result.append(Character.toUpperCase(word.charAt(0)))
                .append(word.substring(1,word.length()-1))
                .append(Character.toUpperCase(word.charAt(word.length() - 1)));
            }
            if(i < words.length - 1) {
                result.append(" ");
            }
        }
        System.out.println(result.toString());
     }
}
