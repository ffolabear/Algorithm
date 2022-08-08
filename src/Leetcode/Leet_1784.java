package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leet_1784 {

    public boolean checkOnesSegment(String s) {

        boolean isSegment = true;
        int cnt = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                cnt++;
            }
        }


        for (int i = 1; i < s.length(); i++) {

            //현재 인덱스가 1
            if (s.charAt(i) == '1') {
                if (s.charAt(i - 1) == '1') {
                    isSegment = true;
                } else {
                    isSegment = false;
                }
            } else {
                if (cnt > 1) {
                    isSegment = false;
                    break;
                }

            }
        }

        if (cnt == 1) {
            isSegment = true;
        }


        return isSegment;
    }

    public static void main(String[] args) {

        String s = "1100111";
        Leet_1784 sol = new Leet_1784();

        System.out.println(sol.checkOnesSegment(s));

    }

}
