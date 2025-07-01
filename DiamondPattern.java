public class DiamondPattern {
    public static void main(String[] args) {
        int n = 3;  // Half the number of rows
        printDiamond(n);
    }

    static void printDiamond(int n) {
        // Loop for the upper half (including middle row)
        for (int row = 0; row <= n; row++) {
            // Print spaces
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }
            // Print stars
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Loop for the lower half
        for (int row = n - 1; row >= 0; row--) {
            // Print spaces
            for (int spaces = 0; spaces < n - row; spaces++) {
                System.out.print(" ");
            }
            // Print stars
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
