package Lecture.string;

import java.util.ArrayList;
import java.util.Scanner;

public class ShortestDistance {

    private String solution(String s, String t) {

        ArrayList<Integer> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int lastIdx = 0;

        for (int i = 0; i < s.length(); i++) {

            String current = String.valueOf(s.charAt(i));
            if (current.equals(t)) {
                ans.add(0);
                lastIdx = i;
            } else {

            }
        }

        for (int i : ans) {
            sb.append(i).append(" ");
        }


        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        ShortestDistance sol = new ShortestDistance();

        System.out.println(sol.solution(s, t));

    }

}
