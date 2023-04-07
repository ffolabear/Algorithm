package programmers.level02;

public class NumberExpression {

    public int solution(int n) {

        int answer = 0;


        for (int i = 1; i <= n; i++) {
            int sum = 0;

            for (int j = i; j <= n; j++) {

                sum += j;

                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }

        }
        System.out.println(answer);

        return answer;
    }


    public static void main(String[] args) {

        int n = 15;
        NumberExpression sol = new NumberExpression();
        sol.solution(n);


    }
}
