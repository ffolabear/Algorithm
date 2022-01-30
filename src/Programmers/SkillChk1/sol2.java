package Programmers.SkillChk1;

public class sol2 {

    public int solution(int n) {

        StringBuilder sb = new StringBuilder();
        int answer = 0;

        while (n > 0) {
            sb = sb.append(n % 3);
            n /= 3;
        }

        int digit = sb.length() - 1;

        for (int i = 0; i < sb.length() ; i++) {
            answer += Integer.parseInt(String.valueOf(sb.charAt(i))) * (Math.pow(3, digit--));
        }

        return answer;
    }


    public static void main(String[] args) {

        sol2 sol = new sol2();

        int n = 45;

        sol.solution(n);

    }

}
