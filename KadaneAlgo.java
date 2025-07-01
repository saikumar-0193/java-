public class KadaneAlgo {
    public static void main(String[] args) {
        int[] arr = {2,-1,3,4,-9,5,-1,7,-5};
        int max  = Integer.MIN_VALUE;
        int sum = arr[0];
        for(int i = 1; i < arr.length; i++) {
             
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max,sum);

            } 
            System.out.println(max);
        }
       
    }

