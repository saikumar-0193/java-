public class rightRotate {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = {1,2,3,4,5,6,7};
        int k = 2;
         rightRotate(arr,n,k);
         for(int i = 0; i < n;i++){
            System.out.print(arr[i] + " ");
         }

    }

    public static void rightRotate(int[] arr, int n, int k){
        if(n == 0) return;
        k = k % n;
        if(k > n) return;

        int temp[] = new int[k];
        for(int i = n - k; i < arr.length; i++ ){
            temp[i - n + k] = arr[i];
        }

        for(int i = n - k - 1; i>=0; i--){
            arr[i+k] = arr[i];
        }


        for(int i = 0; i < k;i++){
            arr[i] = temp[i];
        }
        
    }
}
