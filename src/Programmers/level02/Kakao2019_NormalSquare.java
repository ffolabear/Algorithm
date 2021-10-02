package Programmers.level02;

public class Kakao2019_NormalSquare {

    public long solution(int w, int h) {

        long a = w;
        long b = h;

        int val = gcf(w, h);

        long answer = (a * b) - (a + b - val);
        return answer;
    }

    static int gcf(int w, int h) {

        int res = -1;

        int big = Math.max(w, h);
        int small = Math.min(w, h);


        for (int i = big; i > 0; i--) {
            if (big % i == 0) {
                if (small % i == 0) {
                    res = i;
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {


        int W = 8;
        int H = 12;
        Kakao2019_NormalSquare sol = new Kakao2019_NormalSquare();
        sol.solution(W, H);

        gcf(16, 12);


    }

}
