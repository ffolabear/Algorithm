package programmers.level01;

import java.util.*;

public class FailureRate {

    public int[] solution(int N, int[] stages) {

        Arrays.sort(stages);

        int[] clear = new int[N + 1];

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

            double rate = 0;

            if (player == 0) {
                rate = 0;
            } else {
                rate = (double) clear[i] / player;

            }


            player -= clear[i];
            failure.put(i, rate);

        }


        List<Map.Entry<Integer, Double>> list = new ArrayList<Map.Entry<Integer, Double>>(failure.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Double>>() {

            @Override
            public int compare(Map.Entry<Integer, Double> o1, Map.Entry<Integer, Double> o2) {

                if (o1.getValue() == o2.getValue()) {

                    return o2.getKey().compareTo(o1.getKey());

                } else {

                    return o2.getValue().compareTo(o1.getValue());
                }

            }
        });

        System.out.println(list);
        int[] answer = new int[N];

        for (int i = 0; i < list.size(); i++) {

            answer[i] = list.get(i).getKey();
        }

        return answer;
    }


    public static void main(String[] args) {

        int[] stages = {1, 2, 2, 1, 3};
        int N = 5;

        FailureRate sol = new FailureRate();
        sol.solution(N, stages);

    }
}
