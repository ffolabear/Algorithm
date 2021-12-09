package Programmers.level02;

public class NumberExpression {

    public int solution(int n) {

        int answer = 0;

        int cnt = 0;

        for (int i = 1; i <= n; i++) {

            if (cnt == n) {
                break;
            }

            cnt += i;


        }





        return answer;
    }



    public static void main(String[] args) {

        int n = 15;
        NumberExpression sol = new NumberExpression();
        sol.solution(n);


    }
}
