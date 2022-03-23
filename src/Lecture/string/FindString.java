package Lecture.string;

import java.util.Locale;
import java.util.Scanner;

public class FindString {

    private void solution(String word, String alphabet) {

        int answer = 0;

        for (int i = 0; i < word.length(); i++) {
            if (String.valueOf(word.charAt(i)).equals(alphabet)) {
                answer++;
            }
        }

        System.out.println(answer);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String word = in.nextLine().toLowerCase(Locale.ROOT);
        String alphabet = in.nextLine().toLowerCase(Locale.ROOT);

        FindString sol = new FindString();
        sol.solution(word, alphabet);

        return;
    }

}
