public class removeBrackets {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();

        String name = "(a+b(-c))";

        for(int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);

            if( ch != '(' && ch != ')'){
                result.append(ch);
            }
        }
        System.out.println( result.toString());
    }
}
