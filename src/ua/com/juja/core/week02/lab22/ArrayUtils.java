package ua.com.juja.core.week02.lab22;

public class ArrayUtils {

    public static void main(String[] args) {
        int[][] oldArray = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}};

        for (int i = 0; i < oldArray.length; i++) {
            for (int j = 0; j < oldArray[0].length; j++) {
                System.out.print(oldArray[i][j] + "\t");
            }
            System.out.println("");
        }

        System.out.println();

        int[][] newMatrix = null;

        int[][] array = rotateClockwise(oldArray);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }

    }

    public static int[][] rotateClockwise(int[][] arg) {
        /*BODY*/
        if ((arg == null) || (arg.length == 0) || (arg[0] == null) || (arg.length != arg[0].length)) {
            return null;
        }

        int[][] result = new int[arg.length][arg[0].length];


        printMatrix(arg);

        for (int i = 0, l = result[i].length - 1; i < arg.length && l >= 0; i++, l--) {
            if (arg[i] == null || (i != 0 && arg[i].length != arg[i - 1].length)) {
                return null;
            }

            for (int j = 0, k = 0; j < arg[i].length && k < result.length; j++, k++) {
                result[k][l] = arg[i][j];
                printMatrix(result);
            }
        }
        return result;
    }

    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}

