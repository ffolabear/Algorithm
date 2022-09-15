package Programmers.level01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * choices	뜻
 *  [1]	매우 비동의 : 3점
 *  [2]	비동의     : 2점
 *  [3]	약간 비동의 : 1점
 *  [4]	모르겠음   : 0점
 *  [5]	약간 동의  : 1점
 *  [6]	동의      : 2점
 *  [7]	매우 동의  : 3점
 *
 *  [R] vs [T]
 *  [C] vs [F]
 *  [J] vs [M]
 *  [A] vs [N]
 *
 */
public class MBTI_Test {

    public String solution(String[] survey, int[] choices) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < survey.length; i++) {
            int current = choices[i];
            if (current > 0 && current < 4) {
                char currentPersonality = survey[i].charAt(0);
                map.put(currentPersonality, map.getOrDefault(currentPersonality, 0) + 4 - current);
            } else if (current > 4) {
                char currentPersonality = survey[i].charAt(1);
                map.put(currentPersonality, map.getOrDefault(currentPersonality, 0) + current - 4);
            }
        }
        System.out.println(map);
        return "";
    }

    private static String result(Map<Character, Integer> map) {


        return "";
    }

    public static void main(String[] args) {

        MBTI_Test sol = new MBTI_Test();

        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};



//        String[] survey = {"TR", "RT", "TR"};
//        int[] choices = {7, 1, 3};

        sol.solution(survey, choices);

    }
}
