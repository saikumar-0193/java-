public class countingLetters {
    public static void main(String[] args) {
        String str = "My name is sai";
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;
        String temp = str.toLowerCase();
        for(int i = 0;i< temp.length();i++){
            char ch = temp.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }else if( ch == ' '){
                spaces++;
            }else{
                consonants++;
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
        System.out.println(spaces);
    }
}
