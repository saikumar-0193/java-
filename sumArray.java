public class sumArray {
    public static void main(String[] args) {
        int[] arr =  { 1,2 , 3, 4, 5};
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            count = count + arr[i];
        }
        System.out.println( count / n);
    }
}
