package lecture.dfs;

import java.util.Scanner;

public class Combination2 {

    //1 ~ n 까지의 자연수중 r 개를 뽑아 만드는 조합수
    static int N, R;
    static int[][] comb;

    private int dfs(int n, int r) {

        if (comb[n][r] > 0) {
            return comb[n][r];
        } else {

            if (n == r || r == 0) {
                return 1;
            } else {

                return comb[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        R = sc.nextInt();

        comb = new int[N + 1][N + 1];

        Combination2 sol = new Combination2();
        System.out.println(sol.dfs(N, R));


    }

}
