package Programmers.weeklyChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class w03_Dictionary {

    public static String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";

        List<String[]> scores = new ArrayList<>();

        for (int i = 0; i < table.length; i++) {
            scores.add(score(table[i], languages, preference));
        }

        int max = 0;

        for (int i = 0; i < scores.size(); i++) {
            max = Math.max(max, Integer.parseInt(scores.get(i)[1]));
        }

        List<String> res = new ArrayList<>();

        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i)[1].equals(String.valueOf(max))) {
                res.add(scores.get(i)[0]);
            }
        }

        if (res.size() > 1) {
            Collections.sort(res);
        }
        answer = res.get(0);

        return answer;
    }

    static String[] score(String row, String[] languages, int[] preference) {

        String[] part = row.split(" ");

        String[] score = new String[2];
        int sum = 0;

        for (int i = 0; i < languages.length; i++) {
            for (int j = 0; j < part.length; j++) {

                if (languages[i].equals(part[j])) {
                    score[0] = part[0];
                    sum += (part.length - j) * preference[i];
                }

            }
        }
        score[1] = String.valueOf(sum);

        return score;
    }

    public static void main(String[] args) {

        String[] table = {"SI JAVA JAVASCRIPT SQL PYTHON C#",
                "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++",
                "HARDWARE C C++ PYTHON JAVA JAVASCRIPT",
                "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP",
                "GAME C++ C# JAVASCRIPT C JAVA"};


        String[] language = {"PYTHON", "C++", "SQL"};

        int[] preference = {7, 5, 5};

        solution(table, language, preference);

        System.out.println(solution(table, language, preference));

    }


}
