public class movingZeroes {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 3, 0, 4, 0, 5};
        moveZeroes(arr);

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void moveZeroes(int[] a) {
        int j = 0; // Pointer for the position to swap non-zero elements

        // Iterate through the array
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                // Swap non-zero element with the element at position 'j'
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }
    }
}
