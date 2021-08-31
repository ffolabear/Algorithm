package Programmers;

import java.util.Arrays;

public class k_number {


    public static int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = new int[commands[i][1] - commands[i][0] + 1];

            for (int j = 0; j < temp.length; j++) {

                temp[j] = array[commands[i][0] - 1 + j];

            }
            Arrays.sort(temp);

            answer[i] = temp[commands[i][2] - 1];
            System.out.println("answer[" + i + "] : " + answer[i]);


        }

        return answer;
    }


    public static void main(String[] args) {

        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        int[][] comd = {{2, 5, 3}, { 4, 4, 1}, {1,7,3}};
        solution(arr, comd);

    }
}
