package Programmers.level02;

import java.util.ArrayList;

public class TriangleSnail {


    public int[] solution(int n) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            list.add(row);
        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {

        }


        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {

        int n = 4;
        TriangleSnail sol = new TriangleSnail();
        sol.solution(n);

    }


}
