package programmers.level01;

public class middle_char {

    public static String solution(String s) {

        String answer = "";

        if(s.length()%2 == 1){
            answer += s.substring(s.length()/2, s.length()/2 + 1);
        } else {
            answer += s.substring(s.length()/2 -1, s.length()/2 + 1);
        }


        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        String s = "abcde";
        solution(s);

    }
}
