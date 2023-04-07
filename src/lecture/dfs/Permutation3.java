package lecture.dfs;

import java.util.Scanner;

/*
    10이하의 N개의 자연수가 주어지면 이중 M개를 뽑아 일렬로 나열하는 방법
 */

public class Permutation3 {

    static int N, M;
    static int[] nums;
    static int[] ans;
    static boolean[] visited;

    private void dfs(int depth) {

        if (depth == M) {
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        } else {
            for (int i = 1; i <= N; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    ans[depth] = nums[i];
                    dfs(depth + 1);
                    visited[i] = false;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();

        nums = new int[N + 1];
        visited = new boolean[N + 1];
        ans = new int[M];

        for (int i = 1; i <= N; i++) {
            nums[i] = sc.nextInt();
        }

        Permutation3 sol = new Permutation3();
        sol.dfs(0);

    }


}
