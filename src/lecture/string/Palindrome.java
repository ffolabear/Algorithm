package lecture.string;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {

    private boolean solution(String word) {

        int lt = 0;
        int rt = word.length() - 1;
        boolean isValid = true;

        while (lt < rt) {
            if (word.charAt(lt) == word.charAt(rt)) {
                isValid = true;
            } else {
                isValid = false;
                break;
            }

            lt++;
            rt--;
        }

        if (isValid) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next().toLowerCase(Locale.ROOT);
        Palindrome sol = new Palindrome();

        if (sol.solution(word)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }
}
