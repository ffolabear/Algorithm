package Programmers.level02;

public class JadenCaseString {

    public String solution(String s) {

        String answer = "";
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {

            StringBuilder sb = new StringBuilder(words[i].toLowerCase());
            sb.setCharAt(0, Character.toUpperCase(sb.charAt(0)));

            answer += sb + " ";
        }

        answer = answer.substring(0, answer.length() - 1);
        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {

        String s = "3people unFollowed me";
//        String s = "for the last week";
//        String s = " ";



        JadenCaseString sol = new JadenCaseString();
        sol.solution(s);

    }
}
