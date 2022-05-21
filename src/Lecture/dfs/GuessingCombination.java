package Lecture.dfs;

import java.util.Scanner;

public class GuessingCombination {

    static int N, M;
    static int[] nums, ans;
    static boolean[] isUsed;

    private void dfs(int L, int S) {

        if (L == M) {
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = S; i <= N; i++) {
                    ans[L] = i;
                    dfs(L + 1, i + 1);

            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        nums = new int[N + 1];
        isUsed = new boolean[N + 1];
        ans = new int[M];

        GuessingCombination sol = new GuessingCombination();
        sol.dfs(0, 1);

    }
}
