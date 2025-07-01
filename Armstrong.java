public class Armstrong {
    public static void main(String[] args) {
        for(int i = 0; i < 500;i++){
            if(isArmstrong(i)){
                System.out.println(i );
            }
        }
    }   

    static boolean isArmstrong(int num){
        int n = num;
        int sum = 0;
        while(n > 0){
            
           int ld = n % 10;
            sum = sum + ld * ld * ld;
            n = n / 10;
        }
        if(sum == num){
            return true;
        }
        return false;
    }
}
