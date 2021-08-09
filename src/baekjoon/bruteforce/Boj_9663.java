package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_9663 {

    static int N, ans;
    static int[] col;
    static StringBuilder sb = new StringBuilder();

    static void input() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());
        col = new int[N + 1];
    }


    static boolean attackable(int x1, int y1, int x2, int y2) {


        if (x1 == x2 || y1 == y2) {
            return true;
        }

        if (x1 - y1 == x2 - y2) {
            return true;
        }

        if (x1 + y1 == x2 + y2) {
            return true;
        }

        return false;
    }

    static void recurFunc(int queen) {

        if (queen == N + 1) {
            ans++;

        } else {

            for (int i = 1; i <= N; i++) {

                boolean backTrack = true;

                for (int j = 1; j <= queen - 1; j++) {
                    if (attackable(queen, i, j, col[j])) {
                        backTrack = false;
                        break;
                    }
                }

                if (backTrack) {
                    col[queen] = i;
                    recurFunc(queen + 1);
                    col[queen] = 0;
                }

            }

        }

    }

    public static void main(String[] args) throws IOException {

        input();
        recurFunc(1);
        sb.append(ans);
        System.out.println(sb.toString());
    }

}
