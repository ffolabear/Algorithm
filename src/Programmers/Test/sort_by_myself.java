package Programmers.Test;

import java.util.*;

public class sort_by_myself {

    public static List<String> solution(String[] strings, int n) {

        List<String> list = new ArrayList<>();

        for(String str : strings){
            list.add(str);
        }

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                return o1.charAt(n) - o2.charAt(n) == 0? o1.compareTo(o2) : o1.charAt(n) - o2.charAt(n);
            }
        });

//        String[] answer = {};


        return list;
    }

    public static void main(String[] args) {

        String[] strings = {"sun", "bed", "car"};
        int n = 1;

        solution(strings, n);

    }
}
