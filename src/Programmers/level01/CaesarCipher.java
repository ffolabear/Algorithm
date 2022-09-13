package Programmers.level01;

public class CaesarCipher {

    public String solution(String s, int n) {

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {

            int current = s.charAt(i);

            if (current >= 65 && current <= 90) {
                if (current + n > 90) {
                    current = n - (90 - current);
                } else {
                    current += n;
                }

            } else if (current >= 97 && current <= 122) {
                if (current + n > 122) {
                    current = n - (122 - current);
                } else {
                    current += n;
                }

            }

            sb.append((char) current);
        }

        String answer = sb.toString();
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        CaesarCipher sol = new CaesarCipher();
        String s = "AB";
        int n = 1;
        sol.solution(s, n);
    }

}
