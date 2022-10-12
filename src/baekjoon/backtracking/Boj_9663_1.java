package baekjoon.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_9663_1 {

    static int N, ans;
    static int[] col;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        col = new int[N + 1];
        dfs(1);
        System.out.println(ans);

    }

    static void dfs(int row) {
        if (row == N + 1) {
            ans++;
        } else {

            for (int c = 1; c <= N; c++) {
                boolean possible = true;
                for (int i = 1; i <= row - 1; i++) {
                    if (isAttackAble(row, c, i, col[i])) {
                        possible = false;
                        break;
                    }
                }

                if (possible) {
                    col[row] = c;
                    dfs(row + 1);
                    col[row] = 0;
                }
            }
        }

    }

    static boolean isValid() {
        for (int i = 1; i <= N; i++) {
            //(i, col[i)
            for (int j = 1; j < i; j++) {
                //(j, col[j)
                if (isAttackAble(i, col[i], j, col[j])) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isAttackAble(int r1, int c1, int r2, int c2) {

        if (c1 == c2 || r1 - c1 == r2 - c2 || r1 + c1 == r2 + c2) {
            return true;
        }
        return false;
    }

}
