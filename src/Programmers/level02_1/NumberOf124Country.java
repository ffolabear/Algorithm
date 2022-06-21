package Programmers.level02_1;

public class NumberOf124Country {

    public String solution(int n) {


        StringBuilder answer = new StringBuilder();

        while (n > 0) {

            int remainder = n % 3;
            n = n / 3;

            if (remainder  == 0) {
                remainder = 4;
                n -= 1;
            }

            answer.insert(0, remainder);




        }


        return answer.toString();
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
