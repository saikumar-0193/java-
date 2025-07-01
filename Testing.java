import java.util.Scanner;
public class Testing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
      
        FindRange(start,end);
    }
    public static void FindRange(int start, int end) {
       boolean found = false;
        for(int i = start; i <= end; i++) {
            if(FindPalindrome(i)) {
                System.out.print(i + " ");
                found = true;
            }
           
        }
        if(!found) {
            System.out.print(-1);
        }
    }
    public static boolean FindPalindrome(int num) {
        int rev = 0;
        int Original = num;
        while(num > 0) {
        int number = num % 10;
        rev = rev * 10 + number;
        num = num / 10;
        }
         
        if(rev == Original) {
            return true;
        }else {
            return false;
        }
    }
    
}
