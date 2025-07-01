
public class arrays {
    public static void main(String[] args) {
        int rows = 4; // Number of rows in the pattern
        int start = 1; // Initial starting number

        for (int i = 1; i <= rows; i++) {
            int current = start; // Set the current starting number for the row

            for (int j = 0; j < i; j++) {
                System.out.print(current--); // Print the current number and decrement it
            }

            start += i; // Update the starting number for the next row
            System.out.println(); // Move to the next line
        }
    }
}
