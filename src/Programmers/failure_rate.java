package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class failure_rate {

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        ArrayList<Integer> list = new ArrayList<>();
        for (int i : stages) {
            list.add(i);
        }


        for (int stage = 1; stage <= stages.length; stage++) {



        }


        return answer;
    }

    public static void main(String[] args) {

        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int N = 5;
        solution(N, stages);
    }
}
