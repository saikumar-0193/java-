public class PrintSubArrays {
    public static void main(String[] args) {
        int[] arr = {3,4,5,10,1,2,1,1,2,5,5,11};
        int k = 15;
        int maxLen = 0;
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if(sum <= k) {
                    maxLen = Math.max(maxLen , j - i + 1);
                } else {
                    break;
                }
            }
        }
        System.out.println(maxLen);
    }
}
