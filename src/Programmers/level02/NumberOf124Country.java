package Programmers.level02;

public class NumberOf124Country {

    public String solution(int n) {


        String answer = "";

        while (n > 0) {
            if (n % 3 == 0) {
                answer = "4" + answer;
                n -= 1;
            } else {
                answer = n % 3 + answer;
            }

            n = n / 3;


        }


        return answer;
    }

    public static void main(String[] args) {

        int N = 10;
//        int N = 2;
//        int N = 3;
//        int N = 4;

        NumberOf124Country sol = new NumberOf124Country();
        sol.solution(N);

    }

}
