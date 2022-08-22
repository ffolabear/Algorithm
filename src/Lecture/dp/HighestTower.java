package Lecture.dp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class HighestTower {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] bricks = new int[N][3];
        //i번쨰 벽돌을 제일 위에 벽돌로 쌓였을때
        int[] dy = new int[N];

        // [i][0] : 넓이
        // [i][1] : 높이
        // [i][2] : 무

        for (int i = 0; i < N; i++) {
            bricks[i][0] = sc.nextInt();
            bricks[i][1] = sc.nextInt();
            bricks[i][2] = sc.nextInt();
        }

        Arrays.sort(bricks, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                return o2[0] - o1[0];
            }
        });

//        for (int i = 0; i < bricks.length; i++) {
//            System.out.println(bricks[i][0]);
//        }

        dy[0] = bricks[0][1];

        for (int i = 1; i < N; i++) {

            int max = 0;

            for (int j = i - 1; j >= 0; j--) {
                if (bricks[j][2] > bricks[i][2] && dy[j] > max) {
                    max = dy[j];
                }
                dy[i] = max + bricks[i][1];

            }

        }

        int ans = Integer.MIN_VALUE;
        for (int i : dy) {
            ans = Math.max(ans, i);
        }

        System.out.println(ans);
    }

}
