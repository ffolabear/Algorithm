package Lecture.dfs;

import java.util.Scanner;

public class GuessingPermutation2 {

    //정답값을 구하는 배열
    static int[] cases;

    //현재 유효 숫자 배열
    static int[] currentCombination;

    //1 ~ N 까지 사용여부
    static boolean[] isUsed;

    //정답 구하면 더 이상 탐색할 필요 없음
    static boolean flag = false;

    static int N, F;

    //메모이제이션 용 배열
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
                System.out.println();
                flag = true;
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

    //조합 구하는 메서드 - 메모이제이션
    public int combination(int n, int r) {
        if (comb[n][r] > 0) {
            return comb[n][r];
        }

        if (n == r || r == 0) {
            return 1;
        } else {
            return comb[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        F = sc.nextInt();

        cases = new int[N];
        currentCombination = new int[N];
        isUsed = new boolean[N + 1];

        GuessingPermutation2 sol = new GuessingPermutation2();

        for (int i = 0; i < N; i++) {
            cases[i] = sol.combination(N - 1, i);
        }

        sol.dfs(0, 0);


    }
}
