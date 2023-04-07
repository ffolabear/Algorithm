package lecture.dp;

import java.util.ArrayList;
import java.util.Scanner;

class Problem {

    int time;
    int score;

    public Problem(int score, int time) {
        this.score = score;
        this.time = time;
    }
}

public class MaximumScore {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        ArrayList<Problem> list = new ArrayList<>();

        //i분이 주어졌을때 풀 수 있는 문제들의 최대 점수 합
        int[] dy = new int[M + 1];

        for (int i = 0; i < N; i++) {
            int score = sc.nextInt();
            int time = sc.nextInt();
            Problem problem = new Problem(score, time);
            list.add(problem);
        }


        for (int i = 0; i < N; i++) {

            Problem current = list.get(i);
            int score = current.score;
            int time = current.time;

            for (int j = M; j >= time; j--) {
                dy[j] = Math.max(dy[j], dy[j - time] + score);
            }
        }

        System.out.println(dy[M]);


    }


}
