package baekjoon.lecture.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj17143 {

    static int[][] board;
    static int[][] sharkInfo;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //낚시터 세로
        int R = Integer.parseInt(st.nextToken());

        //낚시터 가로
        int C = Integer.parseInt(st.nextToken());

        //상어 숫자
        int M = Integer.parseInt(st.nextToken());


        //낚시터
        board = new int[R + 1][C + 1];

        //상어정보
        sharkInfo = new int[M][5];

        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine());

            sharkInfo[i][0] = Integer.parseInt(st.nextToken());
            sharkInfo[i][1] = Integer.parseInt(st.nextToken());
            sharkInfo[i][2] = Integer.parseInt(st.nextToken());
            sharkInfo[i][3] = Integer.parseInt(st.nextToken());
            sharkInfo[i][4] = Integer.parseInt(st.nextToken());

            board[sharkInfo[i][0]][sharkInfo[i][1]] = i + 1;

        }

        //상어번호 : 위치 r,c / 속력 / 이동 방향 / 크기


        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }


    }


    static void move() {

        for (int i = 1; i < board.length; i++) {
            for (int j = 1; j < board[i].length; j++) {

                if (board[i][j] != 0) {
                    board[i][j] = 0;




                }

            }


        }

    }

}
