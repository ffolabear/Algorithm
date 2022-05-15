package Lecture.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OverlappedArray {

    static int N, M;
    static int[] ans;

    private void dfs(int c) {

        if (c == M) {
            for (int i : ans) {
                System.out.print(i + " ");
            }
            System.out.println();

        } else {
            for (int i = 1; i <= N; i++) {
                ans[c] = i;
                dfs(c + 1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();
        ans = new int[M];

        OverlappedArray sol = new OverlappedArray();

        sol.dfs(1);

    }

}
