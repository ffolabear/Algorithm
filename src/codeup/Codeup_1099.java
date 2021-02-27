package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_1099 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[][] board = new int[10][10];

        for (int i = 0; i < 10; i++) {

            String input = bf.readLine();
            String[] boardArr = input.split(" ");

            for (int j = 0; j < 10; j++) {
                board[i][j] = Integer.parseInt(boardArr[j]);
            }
        }

        int ptrX = 1;
        int ptrY = 1;

        while (board[ptrX][ptrY] != 2 && (ptrX+1 != 9 && ptrY+1 != 9)) {

            if (ptrX + 1 == 0) {
                board[ptrX][ptrY] = 9;
                ptrX++;
            } else if (ptrX + 1 == 1) {
                board[ptrX][ptrY] = 9;
                ptrY++;
            }


        }


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }


    }

}
