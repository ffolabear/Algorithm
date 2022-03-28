package Lecture.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CalculateRank {

    private void solution(int[] rank) {

        StringBuilder sb = new StringBuilder();
//        Map<Integer, Integer> map = new HashMap<>();
//
//        int[] clone = rank.clone();
//        Arrays.sort(clone);
//
//        int last = rank.length;
//
//        for (int i = 0; i < rank.length; i++) {
//            map.put(clone[i], last--);
//        }
//
//        for (int i = 0; i < rank.length; i++) {
//            sb.append(map.get(rank[i])).append(" ");
//        }

        int[] rankArr = new int[rank.length];
        Arrays.fill(rankArr, 1);

        for (int i = 0; i < rank.length; i++) {
            int current = rank[i];

            for (int j = 0; j < rank.length; j++) {
                if (current < rank[j]) {
                    rankArr[i]++;
                }
            }


        }

        System.out.println();

        for (int i : rankArr) {
            System.out.print(i + " ");
        }

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] rank = new int[N];

        for (int i = 0; i < N; i++) {
            rank[i] = in.nextInt();
        }

        CalculateRank sol = new CalculateRank();
        sol.solution(rank);

    }
}
