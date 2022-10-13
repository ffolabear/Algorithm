package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Boj_1316 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        List<String> list = new ArrayList<>();


        for (int i = 0; i < N; i++) {
            String word = bf.readLine();
            list.add(word);
        }

        int answer = 0;

        for (int i = 0; i < list.size(); i++) {

            HashMap<Character, Integer> map = new HashMap<>();
            char last = ' ';
            boolean valid = false;

            for (int j = 0; j < list.get(i).length(); j++) {


                int before = map.size();
                if (list.get(i).charAt(j) == last) {
                    continue;

                } else {
                    map.put(list.get(i).charAt(j), 0);

                    if (before == map.size()) {
                        valid = true;
                    }

                }


                last = list.get(i).charAt(j);
            }

            if (!valid) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
