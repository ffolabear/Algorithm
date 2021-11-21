package Programmers.level02;

import java.util.HashMap;
import java.util.Map;

public class CompilationCollection {

    public int solution(String word) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('E', 1);
        map.put('I', 2);
        map.put('O', 3);
        map.put('U', 4);

        int order = 0;

        for (int i = 0; i < word.length(); i++) {
            order += map.get(word.charAt(i));
        }

        System.out.println(order);


        int answer = 0;
        return answer;
    }

    public static void main(String[] args) {

        String word = "AAAAE";


        CompilationCollection sol = new CompilationCollection();
        sol.solution(word);

    }


}
