public class ascii {

    public static void main(String[] args) {

        StringBuilder result = new StringBuilder();
        String str = "i am sai 2% from 35&***";
        for (int i = 0; i < str.length(); i++) {
            int ascii = (int) str.charAt(i);

           if ((ascii >= 65 && ascii <= 90) || (ascii >= 97 && ascii <= 122)) 
           result.append(str.charAt(i));
    }
    System.out.println(result.toString());
  }
 }
