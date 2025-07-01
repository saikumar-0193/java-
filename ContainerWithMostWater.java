public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int left = 0;
        int right = arr.length - 1;
        int maxArea = 0;
        while(left < right) {
            int width = right - left;
            int minWidth = Math.min(arr[left], arr[right]);
            maxArea = Math.max(maxArea, minWidth * width);

            if(arr[left] > arr[right] ) {
                right--;
            }
            else {
                left++;
            }
        }
        System.out.println(maxArea);
    }
}
