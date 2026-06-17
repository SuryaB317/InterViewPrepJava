package Matrix;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] matrixA = { {1, 2, 3}, {4, 5, 6},{7, 8, 9} };
        int[][] matrixB = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int length = matrixA.length;
        int[][] result = new int[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                result[i][j] = 0;
                for (int k = 0; k < length; k++) {
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }
    }
}
