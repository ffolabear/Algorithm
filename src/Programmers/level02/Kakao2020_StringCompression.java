package Programmers.level02;

import org.junit.Assert;
import org.junit.Test;

public class Kakao2020_StringCompression {

    public int solution(String s) {

        int answer = Integer.MAX_VALUE;

        int center = s.length() / 2;

        if (s.length() == 1){
            return 1;
        }


        for (int i = 1; i <= center; i++) {

            //압축한 문자열들을 저장할 변수
            StringBuilder covt = new StringBuilder();

            //갈이별로 자른 문자열 비교 변수
            String compare = "";

            int cnt = 1;

            for (int j = 0; j < s.length() / i; j++) {

                String unit = s.substring((j * i), ((j * i) + i));
                System.out.println(unit);

                if (compare.equals(unit)) {
                    cnt++;
                    continue;
                }

                //카운트가 1이상이면 압축하고 아니라면 그냥 붙여줌
                if (cnt > 1) {
                    covt.append(cnt).append(compare);
                    cnt = 1;
                } else {
                    covt.append(compare);
                }

                compare = unit;
            }

            if (cnt > 1) {
                covt.append(cnt).append(compare);
            } else {
                covt.append(compare);
            }

            if (s.length() % i != 0) {
                covt.append(s.substring(s.length() - s.length() % i));
            }

            answer = Math.min(answer, covt.length());
        }

        return answer;
    }


//----------------------------------------------------------------------------------------------------------------------


    public static void main(String[] args) {

        String s = "aabbaccc";
        //String s = "ababcdcdababcdcd";
        //String s = "abcabcdede";
        //String s = "abcabcabcabcdededededede";
        //String s = "xababcdcdababcdcd";

        Kakao2020_StringCompression stringComp = new Kakao2020_StringCompression();
        stringComp.solution(s);

    }

    @Test
    public void test(){
        Assert.assertEquals(7, solution("aabbaccc"));
        Assert.assertEquals(9, solution("ababcdcdababcdcd"));
        Assert.assertEquals(14, solution("abcabcabcabcdededededede"));
        Assert.assertEquals(17, solution("xababcdcdababcdcd"));

    }

}
