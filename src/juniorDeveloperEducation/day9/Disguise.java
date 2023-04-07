package juniorDeveloperEducation.day9;

import java.util.HashMap;
import java.util.Map;

public class Disguise {

    public int solution(String[][] clothes) {

        int answer = 1;

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }

        for (String str : map.keySet()) {
            answer *= (map.get(str) + 1);
        }

        answer -= 1;

        return answer;
    }

    public static void main(String[] args) {

        String[][] clothes = {
                               {"yellowhat", "headgear"},
                               {"bluesunglasses", "eyewear"},
                               {"green_turban", "headgear"}
                             };

//        String[][] clothes = {
//                {"crow_mask", "face"},
//                {"blue_sunglasses", "face"},
//                {"smoky_makeup", "face"}
//        };


        Disguise sol = new Disguise();
        sol.solution(clothes);

    }

}
