package Lecture.string;

import java.util.Scanner;

public class WordInSentence {

    private String solution(String input) {

        String[] words = input.split(" ");

        String ans = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > ans.length()) {
                ans = words[i];
            }
        }

        return ans;
    }


    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String input = in.nextLine();

        WordInSentence sol = new WordInSentence();
        System.out.println(sol.solution(input));
    }

}
