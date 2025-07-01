public class missingNumber3 {
    public static void main(String[] args) {
        int [] arr = { 3,1,2,3,5,6,8};
        int n = 7;
        int ans = missingNumber(arr, n);
        System.out.println(ans);
     }
     public static int missingNumber(int[] a, int n){
        for(int i = 1; i < n;i++){
            int flag = 0;
            for(int j = 0; j < n-1;j++){
                if(a[j] == i){
                    flag = 1;
                    break;
                }
               
            }
            if(flag == 0) return i;
        }
        return -1;
     }
}
