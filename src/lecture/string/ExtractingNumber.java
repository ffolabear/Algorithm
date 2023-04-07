package lecture.string;

import java.util.Scanner;

public class ExtractingNumber {

    private String solution(String input) {

        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < input.length(); i++) {
//            String current = String.valueOf(input.charAt(i));
//
//            if (current.matches("[0-9]")) {
//                sb.append(current);
//            }
//        }
//
//        return Integer.parseInt(sb.toString());

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
                sb.append(input.charAt(i));
            }


        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        ExtractingNumber sol = new ExtractingNumber();

        System.out.println(sol.solution(input));

    }
}
