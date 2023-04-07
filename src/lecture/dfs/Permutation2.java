package lecture.dfs;

import java.util.Scanner;

public class Permutation2 {

    static int N, M;
    static int[] nums;
    static int[] ans;
    static boolean[] visited;

    private void dfs(int depth) {

        if (depth == nums.length - 1) {
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
        ans = new int[nums.length - 1];

        for (int i = 1; i <= N; i++) {
            nums[i] = sc.nextInt();
        }

//        for (int num : nums) {
//            System.out.print(num + " ");
//        }
//        System.out.println();

        Permutation2 sol = new Permutation2();
        sol.dfs(0);

    }


}
