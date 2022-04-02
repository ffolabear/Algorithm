package Lecture.hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ClassPresident {

    private void solution(int N, String s) {


        HashMap<Character, Integer> voteRes = new HashMap<>();
        for (char c : s.toCharArray()) {
            voteRes.put(c, voteRes.getOrDefault(c, 0) + 1);
        }


        System.out.println(voteRes);

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String s = in.next();


        ClassPresident sol = new ClassPresident();
        sol.solution(N, s);

    }
}
