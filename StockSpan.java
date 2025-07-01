public class StockSpan {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        int[] span = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            span[i] = 1;
            for(int j = i - 1; j>= 0 && arr[i] >= arr[j] ;j--) {
                span[i]++;
            }
        }
        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }
}
