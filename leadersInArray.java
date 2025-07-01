public class leadersInArray {
    public static void main(String[] args) {
        int[] arr = {8,1,2,3,4,5,0};
        int n = 7;
        for(int i = 0; i < n;i++){
            boolean isGreater = true;
            for(int j = i+1; j < n;j++){
                if(arr[i] < arr[j] ){
                   isGreater = false;
                }
            }
            if(isGreater){
                System.out.println(arr[i]);
            }
        }
       
    }
}
