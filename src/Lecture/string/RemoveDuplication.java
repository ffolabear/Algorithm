package Lecture.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDuplication {

    private String solution(String word) {

        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char current = word.charAt(i);

            if (!map.containsKey(current)) {
                map.put(current, 0);
                sb.append(current);
            }
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        RemoveDuplication sol = new RemoveDuplication();

        System.out.println(sol.solution(word));
    }

}
