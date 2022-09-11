package Programmers.level01;

public class XIntervalNum {

    public long[] solution(int x, int n) {

        long[] answer = new long[n];

        long num = 0;

        for (int i = 0; i < n; i++) {
            num += x;
            answer[i] = num;
        }
        return answer;
    }

    public static void main(String[] args) {

        int x = 2;
        int n = 5;

        XIntervalNum sol = new XIntervalNum();
        sol.solution(x, n);

    }

}
