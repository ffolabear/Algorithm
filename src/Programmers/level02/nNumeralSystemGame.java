package Programmers.level02;

public class nNumeralSystemGame {

    public String solution(int n, int t, int m, int p) {
        String answer = "";


        int numCnt = 0;
        int number = 0;

        while (numCnt != t) {




        }

        return answer;
    }

    static String convert(int n, int num) {

        System.out.println("현재 숫자 : " + num);

        String ans = "";


        for (int i = num; i > 0; i /= n) {

            if (num % n == 10) {
                ans = "A" + ans;
            } else if (num % n == 11) {
                ans = "B" + ans;
            } else if (num % n == 12) {
                ans = "C" + ans;
            } else if (num % n == 13) {
                ans = "D" + ans;
            } else if (num % n == 14) {
                ans = "E" + ans;
            } else if (num % n == 15) {
                ans = "F" + ans;
            } else {
                ans = (num % n) + ans;

            }
            num /= n;
        }

        System.out.println(ans);
        return ans;
    }

    public static void main(String[] args) {
        int n = 2;
        int t = 4;
        int m = 2;
        int p = 1;

        nNumeralSystemGame sol = new nNumeralSystemGame();
        sol.solution(n, t, m, p);


    }

}
