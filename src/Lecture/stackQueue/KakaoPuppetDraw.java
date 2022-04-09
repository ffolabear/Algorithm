package Lecture.stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class KakaoPuppetDraw {

    private int solution(int[][] board, int[] moves) {
        int ans = 0;

        Stack<Integer> puppet = new Stack<>();
        for (int i = 0; i < moves.length; i++) {
            int move = moves[i] - 1;


            for (int j = 0; j < board.length; j++) {
                if (board[j][move] != 0) {
                    if (!puppet.isEmpty()) {
                        if (puppet.peek() == board[j][move]) {
                            puppet.pop();
                            board[j][move] = 0;
                            ans += 2;
                            break;
                        }
                    }

                    puppet.add(board[j][move]);
                    board[j][move] = 0;
                    break;
                }
            }
        }


        return ans;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = in.nextInt();
            }
        }

        int M = in.nextInt();
        int[] moves = new int[M];

        for (int i = 0; i < M; i++) {
            moves[i] = in.nextInt();
        }

        KakaoPuppetDraw sol = new KakaoPuppetDraw();

        System.out.println(sol.solution(board, moves));


    }

}
