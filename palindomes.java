import java.util.Scanner;
public class palindomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] names = new String[n];
        for(int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
       String largest = "";
       int maxDistance = -1;
        for(int i = 1; i < names.length; i++) {
            if(isPalindrome(names[i]) > maxDistance) {
                maxDistance = isPalindrome(names[i]);
                largest = names[i];
            }
        }
        System.out.println(largest);
    }
    public static int isPalindrome(String str) {
        int left = 0;
        int right = str.length()-1;
        int distance = 0;
        while(left < right) {
            if(str.charAt(left ) != str.charAt(right)) {
                distance++;
            }
            left++;
            right--;
        }
        return distance;
    }
}
