package programmers.level01;

public class even_odd {


    public static String solution(int num) {




        String answer = (num%2 == 0)? "Even" : "Odd";

        return answer;
    }



    public static void main(String[] args) {

        int n = 3;
        solution(n);

    }
}
