package lecture.string;

import java.util.Scanner;

public class ShortestDistance {

    private String solution(String s, String t) {

        int[] ans = new int[s.length()];
        int[] ans1 = new int[s.length()];
        StringBuilder sb = new StringBuilder();

        String[] str = s.split("");

        int p = 1000;
        for (int i = 0; i < s.length(); i++) {
            if (str[i].equals(t)) {
                p = 0;
                ans[i] = p++;
            } else {
                ans[i] = p++;
            }
        }

        p = 1000;

        for (int i = s.length() - 1; i >= 0; i--) {
            if (str[i].equals(t)) {
                p = 0;
                ans1[i] = p++;
            } else {
                ans1[i] = p++;
            }

        }


        for (int i = 0; i < ans.length; i++) {
            sb.append(Math.min(ans[i], ans1[i])).append(" ");
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
