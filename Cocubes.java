public class Cocubes {
    public static void main(String[] args) {
        String name = "saikumar";
        int n = 2;
        StringBuilder result = new StringBuilder();
        char[] chars = name.toCharArray();
        for(int i = 0; i < chars.length;i += n) {
            int end = Math.min(i + n, chars.length);
            StringBuilder chunks = new StringBuilder();
            chunks.append(chars[end-1]);

            for(int j = i; j < end - 1; j++) {
                chunks.append(chars[j]);
            }
            result.append(chunks);
        }
   System.out.println(result.toString());
    }
}
