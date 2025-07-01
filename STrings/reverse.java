package STrings;

public class reverse {
    public static void main(String[] args) {
        String name = "saiiiiiiiiiiiiii";
        char target = 'i';
        int count = 0;
        for(char c : name.toCharArray()){
            if(c == target){
                count++;
            }
        }
        System.out.println(count);
    }
}
