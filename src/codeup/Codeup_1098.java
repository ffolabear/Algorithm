package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Codeup_1098 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 사탕 판 설정
        String board = bf.readLine();
        String[] boardArr = board.split(" ");
        int[][] candyBoard = new int[Integer.parseInt(boardArr[0])][Integer.parseInt(boardArr[1])];

        // 시행갯수
        int count = Integer.parseInt(bf.readLine());

        //사탕의 정보를 받은 배열
        String[][] candyArr = new String[count][4];


        for(int i=0; i < count; i++){

            String candyTest = bf.readLine();
            candyArr[i] = candyTest.split(" ");
        }




        for(int i =0; i < candyArr.length; i++){
            // 가로 일떄
            if (Integer.parseInt(candyArr[i][1]) == 0){
                for (int j=0; j < Integer.parseInt(candyArr[i][0]); j++){
                    candyBoard[Integer.parseInt(candyArr[i][2])-1][Integer.parseInt(candyArr[i][2])-1+j]++;

                }

                // 세로일때
            } else {
                for (int j=0; j < Integer.parseInt(candyArr[i][0]); j++){
                    candyBoard[Integer.parseInt(candyArr[i][2])-1+j][Integer.parseInt(candyArr[i][3])-1]++;
                }

            }

        }



        for (int i = 0; i < candyBoard.length; i++) {
            for(int j = 0 ; j <candyBoard[i].length; j++){
                System.out.print(candyBoard[i][j] + " ");
            }
            System.out.println();
        }

    }
}
