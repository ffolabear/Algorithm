package programmers.level01;

import java.util.*;

public class desc_sort {



    public static String solution(String s) {

        List<String> list = new ArrayList<>();
        for(int i=0; i < s.length(); i++){
            list.add(String.valueOf(s.charAt(i)));
        }

        Collections.sort(list, Comparator.reverseOrder());
        String answer = "";

        for(int i=0; i < list.size(); i++){
            answer += list.get(i);
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        String s = "Zbcdefg";
        solution(s);
    }

}
