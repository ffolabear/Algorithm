package Programmers.level02_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCompression {

    public int solution(String s) {

        int maxLen = s.length() / 2;

        if (s.length() == 1) {
            return 1;
        } else {

            for (int i = 1; i <= maxLen; i++) {

            }



        }


        int answer = 0;
        return answer;
    }

    public static void main(String[] args) throws IOException {

        StringCompression sol = new StringCompression();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        sol.solution(s);

    }
}
