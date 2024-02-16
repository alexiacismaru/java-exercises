package be.kdg.java1.assignments.a11_matrix;

public class MatrixApp {
    public static void main(String[] args) {
        int[][] matrix = new int[4][6];
        System.out.println(matrix.length);
    
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = (row + 1) * (col + 1);
            }
        }

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.printf("%2d ", value);
            }
            System.out.println();
        }
    }  // main()
}  // class
