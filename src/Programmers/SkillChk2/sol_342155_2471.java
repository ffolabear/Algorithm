package Programmers.SkillChk2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class sol_342155_2471 {

    static int min = 0;
    static boolean[] isUsed;

    public int solution(String[][] relation) {

        int answer = 0;
        isUsed = new boolean[relation[0].length];

        HashMap<Integer, ArrayList<String>> keys = new HashMap<>();


        return answer;
    }

    //dfs
    static void makeKeys(String[] rows) {

    }

    public static void main(String[] args) {

        String[][] relation = {{"100", "ryan", "music", "2"},
                               {"200","apeach","math","2"}};
        sol_342155_2471 sol = new sol_342155_2471();
        sol.solution(relation);

    }
}
