package Programmers.level02;

public class nNumeralSystemGame {

    public String solution(int n, int t, int m, int p) {

        String answer = "";

        for (int i = 0; i <= m * t; i++) {

            String current = convert(n, i);

            int player = 1;

            for (int j = 0; j < current.length(); j++) {

                System.out.println(current + " - " + current.charAt(j) + " " + player + " " + answer);

                if (answer.length() == t) {
                    break;
                }

                if (player == p) {
                    answer += String.valueOf(current.charAt(j));
                }

                if (player == m) {
                    player = 1;
                    continue;
                }
                player++;

            }

            if (answer.length() == t) {
                break;
            }


        }

        System.out.println(answer);
        return answer;
    }

    static String convert(int n, int num) {

        String ans = "";

        if (num == 0) {

            return "0";
        }

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


        return ans;
    }

    public static void main(String[] args) {
//        int n = 2;
//        int t = 4;
//        int m = 2;
//        int p = 1;

        int n = 16;
        int t = 16;
        int m = 2;
        int p = 1;

        nNumeralSystemGame sol = new nNumeralSystemGame();
        sol.solution(n, t, m, p);


    }

}
