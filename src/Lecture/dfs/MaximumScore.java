package Lecture.dfs;

import java.util.Scanner;

public class MaximumScore {

    static int N, M;
    static int[][] scores;
    static int ans = Integer.MIN_VALUE;

    private void dfs(int v, int sum, int time) {

        if (v == N) {
            if (time > M) {
                return;
            } else {
                ans = Math.max(ans, sum);
            }

        } else {
            dfs(v + 1, sum + scores[v][0], time + scores[v][1]);
            dfs(v + 1, sum, time);
        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        M = in.nextInt();

        scores = new int[N][N];

        for (int i = 0; i < scores.length; i++) {

            scores[i][0] = in.nextInt();
            scores[i][1] = in.nextInt();

        }

        MaximumScore sol = new MaximumScore();
        sol.dfs(0, 0, 0);
        System.out.println(ans);

    }
}
