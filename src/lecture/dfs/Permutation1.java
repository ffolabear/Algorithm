package lecture.dfs;

import java.util.Scanner;

/**
 * 더미 데이터
 *
 * 3 2
3 6 9
 *
 */

public class Permutation1 {

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

//        for (int num : nums) {
//            System.out.print(num + " ");
//        }
//        System.out.println();

        Permutation1 sol = new Permutation1();
        sol.dfs(0);

    }

}
