package Exams.woowacourse4th;

import java.util.ArrayList;
import java.util.List;

public class Sol4 {

    static int index;

    public int[] solution(String s) {


        List<Integer> list = new ArrayList<>();
        List<String> covt = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));

        for (int j = 1; j < s.length(); j++) {
            if (s.charAt(j) == s.charAt(0)) {
                sb.append(s.charAt(j));
            } else {
                break;
            }
        }

        for (int j = s.length() - 1; j > 0; j--) {
            if (s.charAt(j) == s.charAt(0)) {
                sb.append(s.charAt(j));
            } else {
                index = j;
                break;
            }
        }

        if (sb.length() > 1) {
            String res = sb.toString();
            if (res.length() > s.length()) {
                res = res.substring(0, s.length());
                covt.add(res);
            }else{
                covt.add(res);
            }

        } else {
            covt.add(String.valueOf(s.charAt(0)));
        }

        System.out.println(index);
        System.out.println(covt);
        char current = s.charAt(index - 1);

        System.out.println(s.charAt(index - 1));
        StringBuilder sb2 = new StringBuilder();

        for (int i = index - 1; i < s.length() - 1; i++) {

            sb2.append(current);

            if (s.charAt(i) == current) {
                sb2.append(s.charAt(i));

            } else {
                covt.add(String.valueOf(current));

            }

            current = s.charAt(i);

        }


        System.out.println(covt);




        int[] answer = new int[covt.size()];



        return answer;
    }

    public static void main(String[] args) {

        String a = "aaabbaaa";
        Sol4 sol = new Sol4();
        sol.solution(a);

    }
}
