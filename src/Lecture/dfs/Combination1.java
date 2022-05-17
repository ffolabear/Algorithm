package Lecture.dfs;

import java.util.Scanner;

/**
 * 메모이제이션
 * - 값을 참고해서 가져올 2차원 배열
 * - 참고할 배열에 값이 있으면 그냥 그 값을 리턴
 */

public class Combination1 {

    //1 ~ n 까지의 자연수중 r 개를 뽑아 만드는 조합수
    static int N, R;
    static int[][] comb;

    private int dfs(int n, int r) {

        if (comb[n][r] > 0) {
            return comb[n][r];
        }


        //r 개의 숫자중 r개를 뽑는 경우는 한가지이므로 재귀 탈출 조건
        if (n == r || r == 0) {
            return 1;
        } else {
            return comb[n][r] = dfs(n - 1, r - 1) + dfs(n - 1, r);


        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        R = sc.nextInt();

        comb = new int[N + 1][N + 1];

        Combination1 sol = new Combination1();
        System.out.println(sol.dfs(N, R));


    }
}
