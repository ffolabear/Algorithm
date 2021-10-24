package Programmers.level01;

import java.util.*;

public class FailureRate {

    public int[] solution(int N, int[] stages) {

        Arrays.sort(stages);

        int[] clear = new int[N + 1];


//        double[] failure = new double[N + 1];
        Map<Integer, Double> failure = new HashMap<>();


        for (int i : stages) {
            if (i == N + 1) {
                continue;
            } else {
                clear[i]++;
            }
        }

        int player = stages.length;

        for (int i = 1; i < clear.length; i++) {

            double rate = (double) clear[i] / player;
            System.out.println(clear[i] + " / " + player);
            System.out.println("실패율 : " + rate);
            player -= clear[i];
            failure.put(i, rate);
//            failure[i] = rate;
        }

//        for (double d : failure) {
//            System.out.println(d);
//        }
        System.out.println(failure);

        int lastRate = 0;

        for (int value : failure.keySet()) {

            double index = Math.max(lastRate, failure.get(value));

            System.out.println("정렬 : " + index);
            lastRate = value;
            System.out.println(failure.get(lastRate));

        }

        int[] answer = {};


        return answer;
    }


    public static void main(String[] args) {

        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int N = 5;

        FailureRate sol = new FailureRate();
        sol.solution(N, stages);

    }
}
