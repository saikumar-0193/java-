public class maximumOnes {
    public static void main(String[] args) {
        int arr[] = { 1,2,1,1,1,0,1};
        int ans = maxones(arr);
        System.out.println(ans);

    }
    public static int maxones(int array[]){

        int count = 0;
        int max_count = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] == 1){
                count++;
                max_count = Math.max(max_count,count);
            }else{
                count = 0;
            }
        }
        return max_count; 
    }
}
