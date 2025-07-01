public class palindromeString {
    public static void main(String[] args) {
        String name ="saias";
        
        String reversedStr = "";
        for(int i = name.length()-1;i>=0;i--){
            reversedStr += name.charAt(i);  
        }
        System.out.println(reversedStr);
        if(name.equals(reversedStr)){
            System.out.println(name +" is a palindrome");
        }else{
            System.out.println("not palindrome");
        }




        
    }
}
