public class Duplicates2 {
    public static void main(String[] args) {
        int [] arr = {1,31,31,1,4,5,9,8};
        int n = arr.length;
        int[] mark = new int[n];
        for(int i = 0; i < n;i++){
            mark[i] = 0;
        }
        for(int i = 0; i < n;i++){
            
                for(int j = i+1; j < n;j++){
                    if(arr[i] == arr[j]){
                        mark[i]++;
                    }
                
            }
        }
     // // sorted Array

        // Arrays.sort(arr);
        // int index = 0;
        // for(int i = 0; i < n;i++){
        //     if(arr[i] != arr[index]){
        //         index++;
        //         arr[index] = arr[i];
        //     }
        // }
        // for(int i = 0; i <= index; i++){
        //     System.out.println(arr[i]);
        // }
              for(int i = 0; i < n;i++){
            if(mark[i] == 0){
                System.out.print(arr[i] + " ");
            }
        }


    
       
    }
}
