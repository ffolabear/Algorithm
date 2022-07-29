package JuniorDeveloperEducation.day8;

import java.util.Locale;
import java.util.Stack;

public class Palindrome {

    public static void main(String[] args) {

//        String str = "deified";
        String str = "apple";
        str = str.toLowerCase(Locale.ROOT);
        System.out.println(isValid1(str));
        System.out.println(isValid2(str));

        String str2 = "23423, 455 , 3235";

    }

    private static boolean isValid1(String str) {

        StringBuilder sb = new StringBuilder(str).reverse();
        String fromTail = sb.toString();

        if (str.equals(fromTail)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isValid2(String str) {

        Stack<Character> stack = new Stack<>();
        StringBuilder fromTail = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while (!stack.isEmpty()) {
            fromTail.append(stack.pop());
        }

        if (str.equals(fromTail.toString())) {
            return true;
        } else {
            return false;

        }

    }


}
