package exams.naver_webtoon;

public class Solution3 {

    public static void main(String[] args) {

        String s = "aabcbcd";
        String t = "abc";

        System.out.println(solution(s, t));

    }


        public static int solution(String s, String t) {

            int cnt = 0;

            while (s.contains(t)){
                s = s.replaceAll(t, "");
                cnt++;
            }

            return cnt;
        }
}
