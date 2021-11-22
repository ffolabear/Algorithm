package Programmers.level02;


public class CompilationCollection {

    public int solution(String word) {

        int[] digit = {781, 156, 31, 6, 1};
        char[] alphabet = word.toCharArray();

        int answer = 0;

        int cnt = word.length();

        while (cnt > 0) {
            if (alphabet[word.length() - cnt] == 'A') {

                answer += digit[alphabet.length - cnt] * 0 + 1;
            } else if (alphabet[word.length() - cnt] == 'E') {
                answer += digit[alphabet.length - cnt] * 1 + 1;
            }else if (alphabet[word.length() - cnt] == 'I') {
                answer += digit[alphabet.length - cnt] * 2 + 1;
            }else if (alphabet[word.length() - cnt] == 'O') {
                answer += digit[alphabet.length - cnt] * 3 + 1;
            }else if (alphabet[word.length() - cnt] == 'U') {
                answer += digit[alphabet.length - cnt] * 4 + 1;
            }

            cnt--;

        }

        return answer;
    }

    public static void main(String[] args) {

        String word1 = "AAAE";


        CompilationCollection sol = new CompilationCollection();
        sol.solution(word1);

    }


}
