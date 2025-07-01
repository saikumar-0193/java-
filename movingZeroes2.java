public class movingZeroes2 {
    public static void main(String[] args) {
        int [] arr = { 1,2,0,3,4,0};
        int ans[] = movieTheZeroes(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(ans[i] + " ");
        }
    }

    public static int[] movieTheZeroes(int array[]){

        int j = -1;
        for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
             j = i;
             break;
            }
        }

        if(j == -1) return array;


        for(int i = j+1; i < array.length; i++){
            if(array[i] != 0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
        }
        return array;

    }

    
}
