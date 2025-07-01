public class RemoveDup {
    public static void main(String[] args) {
        int[] arr = {2,6,6,7,7,9,9,11,19};
       int ans =  duplicates(arr);
      for (int i = 0; i < ans; i++) {
        System.out.print(arr[i] + " ");
      }
    }  
        public static int duplicates(int[] arr) {
           
            int i = 0;
            for(int j =  1; j < arr.length - 1; j++) {
                if(arr[j]  != arr[i]) {
                    i++;
                    arr[i] = arr[j];
                }
            }
          return i + 1;
        }
        
        
  }
