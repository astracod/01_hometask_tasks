package com.company.test_2.oop;

// Посчитать определитель квадратной матрици (Двумерный массив целых чисел размером NxN)

public class Task_7 {

    public void showMatrix(int[][] matrix) {
        System.out.println(" КВАДРАТНАЯ МАТРИЦА : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) System.out.print(matrix[i][j] + " ");
                if (matrix[i][j] >= 0) System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void showDeterminant(int d) {
        System.out.println(" ОПРЕДЕЛИТЕЛЬ КВАДРАТНОЙ МАТРИЦЫ :");
        System.out.println(d);
    }

    public int[][] matrixWithoutRowAndColumn(int[][] matrix, int row, int col) {
        int height = matrix.length - 1;
        int width = matrix[0].length - 1;

        int[][] buf = new int[height][];
        for (int i = 0; i < buf.length; i++) {

            buf[i] = new int[width];

        }
        for (int i = 0; i < buf.length; i++) {

            for (int j = 0; j < buf[i].length; j++) {
                if (j < col) buf[i][j] = matrix[i + 1][j];
                else buf[i][j] = matrix[i + 1][j + 1];

            }
        }
        return buf;
    }

    public int det(int[][] matrix) {

        if (matrix.length == 1) return matrix[0][0];

        int[] firstLine = matrix[0];
        int sum = 0;
        for (int i = 0; i < firstLine.length; i++) {
            int[][] mat_lowsize = matrixWithoutRowAndColumn(matrix, 0, i);
            sum += (int) Math.pow(-1, i) * firstLine[i] * det(mat_lowsize);
        }
        return sum;
    }

}
