package programmers.level02;

import java.util.ArrayList;

public class TriangleSnail {


    public int[] solution(int n) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        int last = 0;

        for (int i = 1; i <= n; i++) {
            last += i;
        }

        System.out.println(last);

        for (int i = 1; i <= last; i++) {

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
