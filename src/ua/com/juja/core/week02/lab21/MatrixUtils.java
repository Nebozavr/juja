package ua.com.juja.core.week02.lab21;

import java.util.Arrays;

public class MatrixUtils {

    public static void main(String[] args) {

        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{4, 3}, {2, 1}};
        int[][] matrix = mul(matrix1, matrix2);

        printMatrix(matrix1);
        printMatrix(matrix2);
        printMatrix(matrix);

    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }


    public static int[][] mul(int[][] fst, int[][] snd) {
        int fstLength = fst.length;
        int snd0Length = snd[0].length;
        int sndLength = snd.length;

        int[][] result = new int[fstLength][snd0Length];

        for (int i = 0; i < fstLength; i++) {
            for (int j = 0; j < snd0Length; j++) {
                for (int k = 0; k < sndLength ; k++) {
                    result[i][j] += fst[i][k] * snd[k][j];
                }
            }
        }
        
        return result;
    }
}
