public class seoncdLarget {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,78,90};
        int secondLargtest = -1;
        int largest = -1;
        for(int i = 1; i < arr.length;i++) {
            if(arr[i] > arr[0]) {
                largest = arr[i];
            }
        }
        for(int j = 1; j < arr.length; j++) {
            if(arr[j] > arr[0] && arr[j] < largest) {
                secondLargtest = arr[j];
            }
        }
        System.out.println(largest);
    }
}
