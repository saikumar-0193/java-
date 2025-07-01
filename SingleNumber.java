import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args){
     int arr[] = {1,22,22,1,33,22,1};
     int n = arr.length;
        Arrays.sort(arr);
     for(int i = 0; i < n - 1; i++){
        if(arr[i] == arr[i + 1]){
            System.out.println(arr[i]);
           while(i < n-1 && arr[i] == arr[i+1]){
            i++;
           }
        }
     }
     
    }
}
