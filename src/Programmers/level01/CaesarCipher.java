package Programmers.level01;

public class CaesarCipher {

    public String solution(String s, int n) {

        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < s.length(); i++) {

            int current = s.charAt(i);

            if (current >= 65 && current <= 90) {
                if (current + n > 90) {
                    current = current + n - 26;
                } else {
                    current += n;
                }

            } else if (current >= 97 && current <= 122) {
                if (current + n > 122) {
                    current = current + n - 26;
                } else {
                    current += n;
                }

            }


            sb.append((char) current);
        }

        String answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {

        CaesarCipher sol = new CaesarCipher();

//        String s = "AB";
//        int n = 1;
        String s = "a B z";
        int n = 4;
        sol.solution(s, n);
    }

}
