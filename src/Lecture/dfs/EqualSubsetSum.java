package Lecture.dfs;

import java.util.Scanner;

public class EqualSubsetSum {

    static int N;
    static int[] nums;
    static boolean flag = false;
    static int total = 0;
    static String ans = "NO";

    static int cnt = 1;

    private void dfs(int L, int sum) {

        cnt++;

        if (flag) {
            return;
        }

        if (sum > total / 2) {
            return;
        }


        if (L == N) {
            if (sum + sum == total) {
                ans = "YES";
                flag = true;
            }


        } else {

            dfs(L + 1, sum + nums[L]);
            dfs(L + 1, sum);

        }


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        N = in.nextInt();
        nums = new int[N];

        for (int i = 0; i < nums.length; i++) {
            int input = in.nextInt();
            nums[i] = input;
            total += input;
        }

        EqualSubsetSum sol = new EqualSubsetSum();
        sol.dfs(0, 0);
        System.out.println(ans);
        System.out.println(cnt);

    }

}
