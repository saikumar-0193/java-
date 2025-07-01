package STrings;

 public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "banana";
        StringBuilder unique = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (unique.indexOf(String.valueOf(c)) == -1) {
                unique.append(c);
            }
        }
        System.out.println(unique);
    }
 }
 
    

