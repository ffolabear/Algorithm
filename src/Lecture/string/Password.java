package Lecture.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Password {

    private String solution(int N, String str) {

        ArrayList<String> signal = new ArrayList<>();
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < N; i++) {
            signal.add(str.substring(i * 7, (i + 1) * 7));
        }

        for (String s : signal) {
            String current = "";

            for (int i = 0; i < s.length(); i++) {
                if (String.valueOf(s.charAt(i)).equals("#")) {
                    current += "1";
                } else if (String.valueOf(s.charAt(i)).equals("*")) {
                    current += "0";
                }
            }

            int ascii = Integer.parseInt(current, 2);
            ans.append((char) ascii);

        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String str = in.next();

        Password sol = new Password();
        System.out.println(sol.solution(N, str));

    }

}
