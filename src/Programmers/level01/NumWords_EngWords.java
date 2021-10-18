package Programmers.level01;

import java.util.HashMap;
import java.util.Map;

public class NumWords_EngWords {


    public String solution(String s) {

//        String zero = "(zero)";
//        String one = "(one)";
//        String two = "(two)";
//        String three = "(three)";
//        String four = "(four)";
//        String five = "(five)";
//        String six = "(six)";
//        String seven = "(seven)";
//        String eight = "(eight)";
//        String nine = "(nine)";
//
//
//        String str = s.replaceAll(one, "1");
//        System.out.println(str);



        String answer = "";

        answer = s.replaceAll("zero", "0")
                .replaceAll("one","1")
                .replaceAll("two", "2")
                .replaceAll("three", "3")
                .replaceAll("four","4")
                .replaceAll("five", "5")
                .replaceAll("six","6")
                .replaceAll("seven", "7")
                .replaceAll("eight", "8")
                .replaceAll("nine", "9");

        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        String s = "one4seveneight";

        NumWords_EngWords sol = new NumWords_EngWords();
        sol.solution(s);

    }

}
