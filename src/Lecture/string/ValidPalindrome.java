package Lecture.string;

import java.util.Scanner;

public class ValidPalindrome {

    private boolean solution(String str) {

        String regex = "[a-zA-Z]";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (!String.valueOf(str.charAt(i)).matches(regex)) {
                str.replace(str.charAt(i), ' ');
            }

        }

        System.out.println(str);
        return false;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        ValidPalindrome sol = new ValidPalindrome();
        sol.solution(str);



    }


}
