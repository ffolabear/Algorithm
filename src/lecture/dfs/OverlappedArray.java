package lecture.dfs;

import java.util.Scanner;

public class OverlappedArray {

    static int N, M;
    static int[] ans;

    private void dfs(int depth) {

        if (depth == M) {
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();

        } else {
            for (int i = 1; i <= N; i++) {
                ans[depth] = i;
                dfs(depth + 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        ans = new int[M];

        OverlappedArray sol = new OverlappedArray();

        sol.dfs(0);

    }

}
