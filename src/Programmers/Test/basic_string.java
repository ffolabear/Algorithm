package Programmers.Test;

public class basic_string {

    public static boolean solution(String s) {

        boolean answer = true;
        String pattern = "^[0-9]*${110}";
        // 혹은 이렇게도 사용가능 "^[0-9]{4}|{6}$"

        if(s.length() == 6 || s.length() == 4) {

            if(!s.matches(pattern)){
                answer = false;
            }

        } else {
            answer = false;
        }



        return answer;
    }

    public static void main(String[] args) {

    }


}
