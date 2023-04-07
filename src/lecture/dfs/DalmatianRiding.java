package lecture.dfs;

import java.util.Scanner;

public class DalmatianRiding {

    static int[] weights;
    static int C, N;
    static int currentSum = Integer.MIN_VALUE;

    private void dfs(int v, int sum) {
        if (v == N) {
            if (sum >= C) {
                return;
            }

            if (sum > currentSum) {
                currentSum = sum;
            }
        } else {
            dfs(v + 1, sum + weights[v]);
            dfs(v + 1, sum);

        }


    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        C = sc.nextInt();
        N = sc.nextInt();
        weights = new int[N];

        for (int i = 0; i < N; i++) {
            weights[i] = sc.nextInt();
        }

        DalmatianRiding sol = new DalmatianRiding();
        sol.dfs(0, 0);
        System.out.println(currentSum);
    }
}
