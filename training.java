public class training{
    public static void main(String[] args) {
       int arr[] = { 1,2,3,4,4,3,3,2,1};
       int j = 0;
       for(int i = 1; i < arr.length-1;i++){
           if(arr[j] != arr[i+1]){
            System.out.println(arr[i]);
            j++;
           }
       }
    }
}

