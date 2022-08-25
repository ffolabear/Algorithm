package Lecture.dp;

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

        for (int i = 0; i < N; i++) {
            int score = sc.nextInt();
            int time = sc.nextInt();
            Problem problem = new Problem(score, time);
            list.add(problem);
        }



    }


}
