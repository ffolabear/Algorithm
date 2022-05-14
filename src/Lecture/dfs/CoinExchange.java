package Lecture.dfs;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CoinExchange {

    static int N, M;
    static Integer[] coins;

    static int ans = Integer.MAX_VALUE;

    private void dfs(int amount, int sum) {

        if (sum > M) {
            return;
        }

        if (amount >= ans) {
            return;
        }

        if (sum == M) {
            ans = Math.min(ans, amount);
            return;

        } else {
            for (int i = 0; i < coins.length; i++) {
                dfs(amount + 1, sum + coins[i]);
            }

        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        coins = new Integer[N];

        for (int i = 0; i < coins.length; i++) {
            coins[i] = in.nextInt();
        }
        M = in.nextInt();

        Arrays.sort(coins, Collections.reverseOrder());

        CoinExchange sol = new CoinExchange();
        sol.dfs(0, 0);

        System.out.println(ans);

    }


}
