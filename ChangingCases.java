public class ChangingCases {
    public static void main(String[] args) {
        String str = "sai KuMar REDDY";
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
           int ascii = (int)(str.charAt(i));

           if(ascii >= 65 && ascii <= 90) {
             result.append(Character.toLowerCase(str.charAt(i)));
           } else if(ascii >= 97 && ascii <= 122) {
            result.append(Character.toUpperCase(str.charAt(i)));
           } else {
            result.append(" ");
           }
        }
        System.out.println(result.toString());
    }
   
}
