package Programmers.level01;

import java.util.ArrayList;
import java.util.Collections;

public class failure_rate {

    public static int[] solution(int N, int[] stages) {

        int[] answer = new int[N];
        double[] ratio = new double[N + 1];


        for (int i : stages) {

            if (i == N + 1) {
                continue;
            }
            ratio[i]++;
        }

        ArrayList<Double> failure = new ArrayList<Double>();
        double remainPlayer = stages.length;
        double failedPlayer = 0;

        for (int i = 1; i < ratio.length; i++) {
            failedPlayer = ratio[i];

            if (remainPlayer == 0) {
                ratio[i] = 0;

            } else{
                ratio[i] = ratio[i] / remainPlayer;

                remainPlayer = remainPlayer - failedPlayer;
            }

            failure.add(ratio[i]);

        }

        Collections.sort(failure, Collections.reverseOrder());

        for (double i : failure) {
            System.out.println(i);
        }

        System.out.println();

        for (double i : ratio) {
            System.out.println(i);
        }

        for (int i = 0; i < failure.size(); i++) {
            for (int j = 1; j < ratio.length; j++) {

                if (failure.get(i) == ratio[j]) {
                    answer[i] = j;
                    ratio[j] = -1;
                    break;
                }

            }
        }


        return answer;
    }

    public static void main(String[] args) {

        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int N = 5;
        solution(N, stages);
    }
}
