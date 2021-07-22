package Exams.naver_webtoon;

public class Solution2 {

    public static void main(String[] args) {

        String s = "abcxyasdfasdfxyabc";
        System.out.println(solution(s));

    }

    public static String[] solution(String s) {


        for (int i = 1 ; i <= (s.length()+1)/2; i ++){

            System.out.println(s.length() - i + 1);
        }

        return null;
    }


}
