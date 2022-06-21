package Programmers.level02_1;

public class MultiplyMatrix {

    public int[][] solution(int[][] arr1, int[][] arr2) {

        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {

                    answer[i][j] += arr1[i][k] * arr2[k][j];

                }
                System.out.println(answer[i][j]);

            }
        }


        return answer;
    }

    public static void main(String[] args) {

        int[][] arr1 = {
                {1, 4}, {3, 2}, {4, 1}
        };

        int[][] arr2 = {
                {3, 3},
                {3, 3}
        };

        MultiplyMatrix sol = new MultiplyMatrix();
        sol.solution(arr1, arr2);

    }

}
