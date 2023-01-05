package Programmers.level02_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringCompression_2 {

    public int solution(String s) {

        int answer = s.length();

        //가장 긴 단위는 절반보다 클수 없음
        int maxLen = s.length() / 2;

        for (int i = 1; i <= maxLen; i++) {

            String pattern = s.substring(0, i);
            String remain = "";
            int count = 1;
            StringBuilder sb = new StringBuilder();


            for (int j = i; j <= s.length(); j += i) {

                if (i + j >= s.length()) {
                    remain = s.substring(j);
                } else {
                    remain = s.substring(j, j + i);
                }

                if (pattern.equals(remain)) {
                    //만약 현재 비교하는 패턴과 다음 비교 대상이 같은경우
                    count++;

                } else if (count == 1) {
                    //만약 현재 비교하는 패턴과 다음 비교 대상이 다르지만 카운트가 1인 경우
                    sb.append(pattern);
                    pattern = remain;
                } else {
                    //만약 현재 비교하는 패턴과 다음 비교 대상이 다르지만 카운트가 1이 아닌경우
                    sb.append(count).append(pattern);
                    pattern = remain;
                    count = 1;
                }
            }

            //압축후 나머지 붙여줌
            if (i != s.length()) {
                sb.append(pattern);

            }
            answer = Math.min(answer, sb.length());

        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        StringCompression_2 sol = new StringCompression_2();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        sol.solution(s);

    }
}
