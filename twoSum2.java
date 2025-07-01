public class twoSum2 {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,7,8,100,90};
        int target = 190;
        // for(int i = 0; i < arr.length; i++) {
        //     for(int j = i + 1; j < arr.length; j++) {
        //         if(arr[i] + arr[j] == target) 
        //         {
        //             System.out.println(i + " " + j);
        //         }
        //     }
        // }

        int left = 0;
        int right = arr.length -1;
        while(left < right) {
            int sum = arr[left] + arr[right];

            if(sum == target) {
                System.out.println(left + " " + right);
                break;
            }
            else if(sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        
    }
}
