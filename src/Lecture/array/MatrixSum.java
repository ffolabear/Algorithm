package Lecture.array;

import java.util.Scanner;

public class MatrixSum {

    private int solution(int[][] matrix) {

        int ans = Integer.MIN_VALUE;

        int rowSum;
        int columnSum;

        for (int i = 0; i < matrix.length; i++) {
            rowSum = 0;
            columnSum = 0;

            for (int j = 0; j < matrix[i].length; j++) {
                rowSum += matrix[i][j];
                columnSum += matrix[j][i];
            }

            ans = Math.max(ans, Math.max(columnSum, rowSum));
        }



//        for (int i = 0; i < matrix[0].length; i++) {
//
//
//            for (int j = 0; j < matrix.length; j++) {
//                columnSum += matrix[j][i];
//            }
//
//            if (columnSum > ans) {
//                ans = columnSum;
//            }
//        }

        int diagonalSumA = 0;
        int diagonalSumB = 0;

        for (int i = 0; i < matrix.length; i++) {
            diagonalSumA += matrix[i][i];
            diagonalSumB += matrix[i][matrix.length - i -1];

            ans = Math.max(ans, Math.max(diagonalSumA, diagonalSumB));
        }


//        int len = matrix.length - 1;
//
//        for (int i = 0; i < matrix.length; i++) {
//            diagonalSumB += matrix[i][len--];
//            if (diagonalSumB > ans) {
//                ans = diagonalSumB;
//            }
//        }


        return ans;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] matrix = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        MatrixSum sol = new MatrixSum();
        System.out.println(sol.solution(matrix));

    }
}
