package Hackerrank.test;

import java.util.ArrayList;
import java.util.HashMap;

public class sol1 {

    public static void main(String[] args) {

        int answer = 0;

        ArrayList<String> list = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 1);

        map.put("c", 2);
        map.put("d", 2);
        map.put("e", 2);

        map.put("f", 3);
        map.put("g", 3);
        map.put("h", 3);

        map.put("i", 4);
        map.put("j", 4);
        map.put("k", 4);

        map.put("l", 5);
        map.put("m", 5);
        map.put("n", 5);

        map.put("o", 6);
        map.put("p", 6);
        map.put("q", 6);

        map.put("r", 7);
        map.put("s", 7);
        map.put("t", 7);

        map.put("u", 8);
        map.put("v", 8);
        map.put("w", 8);

        map.put("x", 9);
        map.put("y", 9);
        map.put("z", 9);

        String input_str = "asdf";

        for (int i = 0; i <= input_str.length(); i++) {
            for (int j = i + 1; j <= input_str.length(); j++) {
                list.add(input_str.substring(i, j));
            }

        }

        for (int i = 0; i < list.size(); i++) {
            int temp = 0;

            for (int j = 0; j < list.get(i).length(); j++) {
                temp += map.get(String.valueOf(list.get(i).charAt(j)));
            }

            if (temp % list.get(i).length() == 0) {
                answer++;
            }
        }

        System.out.println(answer);

    }


}
