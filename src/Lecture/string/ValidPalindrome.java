package Lecture.string;

import java.util.Locale;
import java.util.Scanner;

public class ValidPalindrome {

    private boolean solution(String str) {

        String regex = "[a-zA-Z]";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            //혹은 replaceAll("[^A-Z]")
            if (!String.valueOf(str.charAt(i)).matches(regex)) {
                sb.append("");
            } else {
                sb.append(str.charAt(i));
            }

        }

        String covt = sb.toString();
        int end = covt.length() / 2;

        for (int i = 0; i <= end; i++) {
            if (covt.charAt(i) != covt.charAt(covt.length() - i - 1)) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().toLowerCase(Locale.ROOT);
        ValidPalindrome sol = new ValidPalindrome();

        if (sol.solution(str)){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


}
