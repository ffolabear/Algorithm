package Exams.kakao_2021;

public class Q1 {

    public static void main(String[] args) {


        String s = "123";
        solution(s);



    }

    public static int solution(String s) {
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


        System.out.println("answer = " + answer);

        return Integer.parseInt(answer);
    }




}
