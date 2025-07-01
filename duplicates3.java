public class duplicates3 {
    public static void main(String[] args) {
        int[]  array = {1,2,3,4,2,5,4,4};
        int k = 5;
        for(int i = 0; i <= k; i++){
            for(int j = i +1; j <=k; j++){
                if(array[i] == array[j]){
                    System.out.println(array[i]);
                }
            }
        }
    }
}
