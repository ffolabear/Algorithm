package programmers.level02;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MinMax {

    public String solution(String s) {

        String answer = "";

        StringTokenizer st = new StringTokenizer(s, " ");
        ArrayList<Integer> list = new ArrayList<>();

        while (st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i : list) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        answer = min + " " + max;
        return answer;
    }

    public static void main(String[] args) {

        MinMax sol = new MinMax();
        String s = "1 2 3 4";
        sol.solution(s);


    }

}
