package exams.bti;

/**
 * n ~ m
 * 사이 팰린드롬 찾기
 */

public class q1 {

    public int solution(int n, int m) {

        int answer = 0;

        for (int i = n; i <= m; i++) {

            String current = String.valueOf(i);

            if (current.length() == 1) {
                answer++;
            } else {

                StringBuilder sb = new StringBuilder(current).reverse();
                if (sb.toString().equals(current)) {
                    answer++;
                }

            }
        }
        return answer;
    }

    public static void main(String[] args) {

        int n = 100;
        int m = 300;

        q1 sol = new q1();

        System.out.println(sol.solution(n, m));
    }


}
