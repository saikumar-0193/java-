public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {3,5,3},
            {12,78,9},
            {90,88,66}
        };
        int max = matrix[0][0];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println(max);
     }
}
