package baekjoon.lecture.simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj17143 {

    static int R, C, M;
    static Shark[][] board;
    static int answer = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //낚시터 세로
        R = Integer.parseInt(st.nextToken());

        //낚시터 가로
        C = Integer.parseInt(st.nextToken());

        //상어 숫자
        M = Integer.parseInt(st.nextToken());


        //낚시터
        board = new Shark[R][C];


        for (int i = 0; i < M; i++) {

            st = new StringTokenizer(br.readLine());

            int r = Integer.parseInt(st.nextToken()); // 행 위치
            int c = Integer.parseInt(st.nextToken()); // 열 위치
            int s = Integer.parseInt(st.nextToken()); // 속력
            int d = Integer.parseInt(st.nextToken()); // 이동 방향
            int z = Integer.parseInt(st.nextToken());

            Shark shark = new Shark(r - 1, c - 1, s, d, z);

            board[r - 1][c - 1] = shark;



        }


        for (int i = 0; i < board.length; i++) {

            if (board[0][i] != null) {
                answer += board[0][i].z;
                board[0][i] = null;
            }

            move();

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

        Queue<Shark> queue = new LinkedList<>();

        //움직일 상어들의 리스트
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                if(board[i][j] != null) {
                    queue.add(new Shark(i, j, board[i][j].s, board[i][j].d, board[i][j].z));
                }
            }
        }


        while (!queue.isEmpty()) {

            Shark current = queue.poll();

            int speed = current.s;
            int direction = current.d;
            int weight = current.z;

            if (direction == 1 || direction == 2) {

            }

            if (direction == 3 || direction == 4) {

            }




        }


    }

}

class Shark {

    int r; // 행 위치
    int c; // 열 위치
    int s; // 속력
    int d; // 방향
    int z; // 크기

    Shark(int r, int c, int s, int d, int z) {
        this.r = r;
        this.c = c;
        this.s = s;
        this.d = d;
        this.z = z;
    }

}
