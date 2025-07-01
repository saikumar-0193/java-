import java.util.Arrays;
public class sumOfElements {
    public static void main(String[] args) {
        // int[] arr = {1,2,4,5,6};
        // int sum = 0;
        // for(int i = 0; i < arr.length;i++){
        //     sum = sum + arr[i];
        // }
        // System.out.println(Math.floor(sum/arr.length));
        // // Arrays.sort(arr);
        // for(int i = 0; i < arr.length/2;i++){
        //     System.out.print(arr[i] + " ");
        // }
        // for(int i = arr.length-1; i >= arr.length/2;i--){
        //     System.out.print(arr[i] + " ");
        // }
        // // System.out.println(arr);

        int []arr = {2,5,6,7,8};
        int n = arr.length;

        Arrays.sort(arr);
            if(n%2 == 0){
                int first =( n / 2 ) - 1;
                int second = (n / 2);
                System.out.println((double)(arr[first] + arr[second]) / 2);
            }else{
               int middle = n / 2;
               System.out.println(arr[middle]);
            }
        
    }
}
