package Programmers.level02;

import java.util.ArrayList;
import java.util.HashMap;

public class Compression {

    public ArrayList<Integer> solution(String msg) {

        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> dict = new HashMap<>();
        int idx = 1;

        for (int i = 65; i <= 90; i++) {
            dict.put(String.valueOf((char) i), idx);
            idx++;
        }

        String temp = "";

        for (int i = 0; i < msg.length(); i++) {
            temp += String.valueOf(msg.charAt(i));

            if (!dict.containsKey(temp)) {
                dict.put(temp, idx);
                idx++;
                temp = String.valueOf(msg.charAt(i));
            }
            answer.add(dict.get(temp));
        }


        return answer;
    }

    public static void main(String[] args) {
        Compression sol = new Compression();
        String msg = "KAKAO";
//        String msg = "TOBEORNOTTOBEORTOBEORNOT";
        sol.solution(msg);
    }
}
