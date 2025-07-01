public class Capitalizee {
    public static void main(String[] args) {
        String str = "sai;!1ku2mar12Reddy";
        int n = 3;
        boolean capitalize = true;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length(); i += n) {
            int end = Math.min(i + n, str.length());
            String sub = str.substring(i, end);
            if(capitalize) {
                result.append(sub.toUpperCase());
            }else 
            {
                result.append(sub);
            }
            capitalize = !capitalize;
        }
        System.out.println(result.toString());
    }
}
