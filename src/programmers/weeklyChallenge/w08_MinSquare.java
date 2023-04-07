package programmers.weeklyChallenge;

import java.util.Arrays;

public class w08_MinSquare {

    public int solution(int[][] sizes) {

        int answer = 0;

        int minA = 0;
        int minB = 0;


        for (int i = 0; i < sizes.length; i++) {
            Arrays.sort(sizes[i]);
        }

        for (int i = 0; i < sizes.length; i++) {
            minA = Math.max(minA, sizes[i][0]);
            minB = Math.max(minB, sizes[i][1]);
        }


        return minA * minB;
    }


    public static void main(String[] args) {

        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
//        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
//        int[][] sizes = {{14, 4}, {19, 6}, {18, 7}, {7, 11}};

        w08_MinSquare sol = new w08_MinSquare();
        sol.solution(sizes);
    }


}
