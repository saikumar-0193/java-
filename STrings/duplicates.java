package STrings;

public class duplicates {
    public static void main(String[] args) {
        String name = "saiiaasr";
        String ans = "";
        boolean[] arr = new boolean[26];
        for(int i = 0; i < name.length();i++){
            if(arr[name.charAt(i)-'a'] == false){
                ans += name.charAt(i);
                arr[name.charAt(i) - 'a'] = true;
            }
        }
        System.out.println(ans);
    }
}
