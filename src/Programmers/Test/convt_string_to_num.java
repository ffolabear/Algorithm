package Programmers.Test;

public class convt_string_to_num {

    public int solution(String s) {

        int answer = 0;

        if(s.substring(0,1).equals("-")){
            answer += (-1) * Integer.parseInt(s.substring(1));
        } else {
            answer +=  Integer.parseInt(s);
        }





        return answer;
    }

    public static void main(String[] args) {

    }

}
