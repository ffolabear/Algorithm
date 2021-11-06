package Exams.woowacourse4th;

import java.util.Arrays;

public class Sol5 {

    public int[][] solution(int rows, int columns) {
        int[][] answer = new int[rows + 1][columns + 1];

        for (int i = 0; i < answer.length; i++) {
            Arrays.fill(answer[i], 0);
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        recursive(1, 1, 1, answer);

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

        return answer;
    }

    static void recursive(int r, int c, int last, int[][] answer) {

        boolean isValid = true;

        for (int i = 1; i < answer.length; i++) {
            for (int j = 1; j < answer[i].length; j++) {
                if (answer[i][j] != 0) {
                    isValid = false;
                }
            }
        }

        if (isValid) {

            answer[r][c] = last;

            if (last % 2 == 1) {

                if (c == answer[0].length - 1) {
                    recursive(r, 1, last++, answer);
                } else {
                    recursive(r, c + 1, last++, answer);

                }
            } else {

                if (r == answer.length - 1) {
                    recursive(1, c + 1, last++, answer);
                } else {
                    recursive(r + 1, c, last++, answer);
                }


            }

        } else {
            return;
        }




    }

    public static void main(String[] args) {

        int rows = 3;
        int columns = 4;

        Sol5 sol = new Sol5();
        sol.solution(rows, columns);


    }

}
