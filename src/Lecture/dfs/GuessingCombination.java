package Lecture.dfs;

import java.util.Scanner;

public class GuessingCombination {

    static int[] cases;
    static int[] currentCombination;
    static boolean[] isUsed;

    static boolean flag = false;

    static int N, F;
    static int[][] comb = new int[35][35];

    public void dfs(int L, int sum) {

        if (flag) {
            return;
        }

        if (L == N) {
            if (sum == F) {
                for (int i : currentCombination) {
                    System.out.print(i + " ");
                }
                flag = true;
                System.out.println();
            }
        } else {
            for (int i = 1; i <= N; i++) {
                if (!isUsed[i]) {
                    isUsed[i] = true;
                    currentCombination[L] = i;
                    dfs(L + 1, sum + (cases[L] * currentCombination[L]));
                    isUsed[i] = false;
                }
            }

        }

    }

    public int combination(int n, int r) {

        if (comb[n][r] > 0) {
            return comb[n][r];
        }

        if (n == r || r == 0) {
            return 1;
        } else {
            return comb[n][r] = combination(n - 1, r) + combination(n - 1, r - 1);
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        F = sc.nextInt();

        cases = new int[N];
        currentCombination = new int[N];
        isUsed = new boolean[N + 1];

        GuessingCombination sol = new GuessingCombination();
        for (int i = 0; i < N; i++) {
            cases[i] = sol.combination(N - 1, i);
        }

        sol.dfs(0, 0);


    }
}
