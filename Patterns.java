public class Patterns {
    public static void main(String[] args) {
        int[][] mat = new int[5][5];
        int num = 1;

        for (int col = 0; col < 5; col++) {
            int elements = 5 - col;
            if (col % 2 == 0) {
                for (int row = col; row < 5; row++) {
                    mat[row][col] = num++;
                }
            } else {
                for (int row = 4; row >= col; row--) {
                    mat[row][col] = num++;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (mat[i][j] != 0)
                    System.out.print(mat[i][j] + "\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
