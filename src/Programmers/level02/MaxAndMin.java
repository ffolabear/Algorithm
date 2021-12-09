package Programmers.level02;

import java.util.StringTokenizer;

public class MaxAndMin {

    public String solution(String s) {

        int[] nums = new int[s.split(" ").length];
        StringTokenizer st = new StringTokenizer(s);

        int index = 0;

        while (st.hasMoreTokens()) {
            nums[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        for (int i : nums) {
            System.out.println(i);
        }

        String answer = "";
        return answer;
    }

    public static void main(String[] args) {

        String s = "1 2 3 4";
//        String s = "-1 -2 -3 -4";
//        String s = "-1 -1";

        MaxAndMin sol = new MaxAndMin();
        sol.solution(s);

    }

}
