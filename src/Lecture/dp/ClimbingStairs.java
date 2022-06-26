package Lecture.dp;

import java.util.Scanner;

/**
 * 문제의 본질은 유지하면서 작은 문제로 쪼갠다.
 * 첫번쨰 계단까지 도착하는 경우의 수 : 1
 * 두번쨰 계단까지 도착하는 경우의 수 : 2
 * ...
 * 피보나치 수열과 비슷
 */



public class ClimbingStairs {

    static int[] dy;
    static int N;

    private static int solution() {
        //첫번째 계단까지 가는 경우는 1가지
        dy[1] = 1;

        //두번째 계단까지 가는 경우는 2가지
        dy[2] = 2;

        for (int i = 3; i <= N; i++) {
            dy[i] = dy[i - 1] + dy[i - 2];
        }

        return dy[N];

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        dy = new int[N + 1 ];
        ClimbingStairs sol = new ClimbingStairs();
        System.out.println(solution());

    }

}
 