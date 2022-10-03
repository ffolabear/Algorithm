package Programmers.level02_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Tuple {

    public ArrayList<Integer> solution(String s) {

        s = s.replaceAll("\\{", "");
        String[] covt = s.split("}");


        for (int i = 0; i < covt.length; i++) {
            if (covt[i].charAt(0) == ',') {
                covt[i] = covt[i].substring(1);
            }
        }

        Arrays.sort(covt, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }

        });

        ArrayList<Integer> answer = new ArrayList<>();

        for (String str : covt) {
            String[] tempArr = str.split(",");
            for (int i = 0; i < tempArr.length; i++) {
                int tempInt = Integer.parseInt(tempArr[i]);
                if (!answer.contains(tempInt)) {
                    answer.add(tempInt);
                }

            }
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        Tuple sol = new Tuple();
//        String s = "{{2},{2,1},{2,1,3,4},{2,1,3}}";
        String s = "{{1,2,3},{2,1},{1,2,4,3},{2}}";
//        String s = "{{2},{2,1},{2,1,3,4},{2,1,3}}";
//        String s = "{{2},{2,1},{2,1,3,4},{2,1,3}}";
//        String s = "{{2},{2,1},{2,1,3,4},{2,1,3}}";
        sol.solution(s);

    }

}
