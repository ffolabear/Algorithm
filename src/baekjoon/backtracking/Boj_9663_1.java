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

    }

    static void dfs(int row) {
        if (row == N + 1) {
            if (isValid()) {
                ans++;
            }
        }

    }

    static boolean isValid() {

        return true;
    }

}
