public class StringBulder {
    public static void main(String[] args) {
        String[] words = {"sai", "siva", "rohit"};
        StringBuilder str = new StringBuilder();
        for(String word : words) {
            str.append(word);
        }
        System.out.print(str);
    }
}
