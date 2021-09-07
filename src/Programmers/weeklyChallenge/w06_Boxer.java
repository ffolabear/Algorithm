package Programmers.weeklyChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class w06_Boxer {

    public int[] solution(int[] weights, String[] head2head) {

        double[][] result = new double[weights.length][3];
//        ArrayList<Double> result = new ArrayList<>();

        for (int i = 0; i < weights.length; i++) {

            double win = 0;
            double bonus = 0;

            for (int j = 0; j < head2head[i].length(); j++) {

                if (head2head[i].charAt(j) == 'W') {
                    win++;
                    if (weights[j] > weights[i]) {
                        bonus++;
                    }
                }
            }


            double winRate = (win /( weights.length - 1)) * 100;

            result[i][0] = i + 1;
            result[i][1] = winRate;
            result[i][2] = (int)bonus;

        }
        System.out.println("------------------------------------------------");



        Arrays.sort(result, new Comparator<double[]>() {

            @Override
            public int compare(double[] o1, double[] o2) {

//                if (o1[1] == o1[1]) {
//                    return (int) (o2[2] - o1[2]);
//                } else {
//                    return (int) (o2[1] - o1[1]);
//                }
                if (o1[1] == o2[1]){
                    return (int) (o2[2] - o1[2]);
                }
                return (int) (o2[1] - o1[1]);


            }

        });

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " 번쨰 선수");
            System.out.println("승률 : " + result[i][1]);
            System.out.println("무거운 사람 이긴 횟수 : " + result[i][2]);
        }


        int[] answer = {};

        return answer;
    }

    public static void main(String[] args) {

        w06_Boxer boxer = new w06_Boxer();

        int[] weights = {50, 82, 75, 120};
        String[] head2head = {"NLWL", "WNLL", "LWNW", "WWLN"};

//        int[] weights = {145,92,86};
//        String[] head2head = {"NLW","WNL","LWN"};

//        int[] weights = {60,70,60};
//        String[] head2head = {"NNN","NNN","NNN"};

        boxer.solution(weights, head2head);

    }
}
