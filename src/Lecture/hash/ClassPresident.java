package Lecture.hash;

import java.util.HashMap;
import java.util.Scanner;

public class ClassPresident {

    private void solution(int N, String s) {

        int max = Integer.MIN_VALUE;
        char ans = ' ';

        HashMap<Character, Integer> voteRes = new HashMap<>();
        for (char c : s.toCharArray()) {
            voteRes.put(c, voteRes.getOrDefault(c, 0) + 1);
        }

        for (char c : voteRes.keySet()) {
            if (voteRes.get(c) > max) {
                max = voteRes.get(c);
                ans = c;
            }

        }

        System.out.println(ans);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String s = in.next();


        ClassPresident sol = new ClassPresident();
        sol.solution(N, s);

    }
}
