package towDMatrix;

public class basic {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int row = sc.nextInt();
        // int col = sc.nextInt();
        // int[][] matrix = new int[row][col];
        // for(int k = 0; k < row; k++) {
        //     for(int l = 0; l < col; l++) {
        //         matrix[k][l] = sc.nextInt();
        //     }
        // }
        
        int[][] matrix = {
            {1,39,44},
            {44,66,77},
            {2,3,55},
        };
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0  ; j < matrix[i].length; j++) {
                if(matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
       System.out.println("Maximum value is : "  + max);
    }
}
