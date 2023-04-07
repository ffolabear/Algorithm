package lecture.string;

import java.util.Locale;
import java.util.Scanner;

public class ConvertingLetter {

    private String solution(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            String current = String.valueOf(str.charAt(i));

            if (current.equals(current.toLowerCase(Locale.ROOT))) {
                sb.append(current.toUpperCase(Locale.ROOT));
            } else{
                sb.append(current.toLowerCase(Locale.ROOT));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        ConvertingLetter sol = new ConvertingLetter();

        System.out.println(sol.solution(input));

    }
}
