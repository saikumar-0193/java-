public class anagrams {
    public static void main(String[] args) {
        String str1 = "saikumar";
        System.out.println(checkDuplicates(str1));

    }

    public static int checkDuplicates(String str1){
        
        int count = 0;
        for(int i = 0; i < str1.length()-1;i++){
            for(int j = i+1; j < str1.length(); j++){
                if(str1.charAt(i) == str1.charAt(j)){
                    count++;
                }
                if(count == 1){
                    return 
                }
            }
        }
                
    }
}
