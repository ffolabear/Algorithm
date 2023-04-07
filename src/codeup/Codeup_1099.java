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

        //((ptrX <= 8 && ptrY<=8) && board[ptrX][ptrY] !=2)
        while (ptrX <= 8 && ptrY<=8) {

            if (board[ptrX][ptrY] ==2 ){
                board[ptrX][ptrY] = 9;
                break;

            } else {
                if (board[ptrX][ptrY + 1] == 0){
                    board[ptrX][ptrY] = 9;
                    ptrY++;
                } else if (board[ptrX][ptrY + 1] == 1) {
                    board[ptrX][ptrY] = 9;
                    ptrX++;
                } else if (board[ptrX][ptrY + 1] == 2) {
                    board[ptrX][ptrY] = 9;
                    board[ptrX][ptrY + 1] =9;
                    break;
                }



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
