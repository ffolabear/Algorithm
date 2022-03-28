package Lecture.array;

import java.util.Scanner;

public class CalculateScore {

    private int solution(int[] scores) {

        int sum = 0;
        int bonus = 0;

        boolean isLastCorrect = false;

        for (int i = 0; i < scores.length; i++) {

            if (scores[i] == 1) {
                if (isLastCorrect) {
                    bonus++;
                    sum += 1 + bonus;
                } else {
                    sum += 1;
                    isLastCorrect = true;
                }
            } else {
                isLastCorrect = false;
                bonus = 0;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] scores = new int[N];

        for (int i = 0; i < N; i++) {
            scores[i] = in.nextInt();
        }

        CalculateScore sol = new CalculateScore();

        System.out.println(sol.solution(scores));
    }

}
