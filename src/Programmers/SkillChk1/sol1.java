package Programmers.SkillChk1;

import java.util.ArrayList;

public class sol1 {

    public ArrayList<Long> solution(long n) {

        String covt = String.valueOf(n);

        ArrayList<Long> answer = new ArrayList<Long>();

        for (int i = covt.length() - 1; i >= 0 ; i--) {
            answer.add((long) (covt.charAt(i) - 48));
        }

        return answer;
    }

    public static void main(String[] args) {

        sol1 sol = new sol1();

        long n = 12345;
        sol.solution(n);

    }


}
