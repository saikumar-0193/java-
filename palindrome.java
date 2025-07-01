public class palindrome {
    public static void main(String[] args) {
        int min = 20;
        int max = 100;
        for(int i = min ; i < max;i++){
            if(isPalindrom(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isPalindrom(int num){
        
        int temp = num;
        int rev = 0;
        while(temp > 0 ){

        int rem = temp % 10;
        rev = rev * 10 + rem;
        temp = temp / 10;
    }
      if(num == rev){
        return true;
      }

      return false;
      }
    }

