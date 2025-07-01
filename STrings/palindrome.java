package STrings;

public class palindrome {
    public static void main(String[] args) {
    //    System.out.println( palindrome(0, "madaam"));
    // }
    // public static boolean palindrome( int i,String s){
    //     if(i >= s.length() / 2)  return true;
    //     if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;

    //     return palindrome(i+1,s);
      
    // char s ='A';
    // int ch = s;
    // System.out.println(ch);

    // String name = "i love rohitsharma";
    // int vowels = 0, consonants = 0, spaces = 0;

    // for(int i = 0; i < name.length();i++){
    //     char ch = name.charAt(i);

    //     if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
    //         vowels++;
    //     }
    //     else if(ch == ' '){
    //         spaces++;
    //     }else{
    //         consonants++;
    //     }
    // }
    // System.out.println("vowels are : " + vowels);
    // System.out.println("consonants are : " + consonants);
    // System.out.println("spaces are : " + spaces);





//     String name = "i love rohitsharma";
    

//     for(int i = 0; i < name.length();i++){
//         char ch = name.charAt(i);

//         if(ch == ' '){
//           name = name.substring(0,i) + name.substring(i+1);
//           i--;
//         }
//     }
//    System.out.println(name);

        // String str = "hello";
        // String reversed = "";
        // Stack<Character> stack = new Stack<>();

        // for(int i = 0; i < str.length();i++){
        //     stack.push(str.charAt(i));
        // }
        
        // while(!stack.isEmpty()){
        //   reversed += stack.pop();
        // }
        
        // System.out.println(reversed);




        String equation = "(a+b-(c*d))";

        for(int i = 0; i < equation.length();i++){
            char ch = equation.charAt(i);
            if(ch == '(' || ch == ')'){
                equation = equation.substring(0, i) + equation.substring(i + 1);
                i--;
            }
        }
        System.out.println(equation);


    }
}
