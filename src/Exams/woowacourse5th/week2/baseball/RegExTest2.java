package Exams.woowacourse5th.week2.baseball;

public class RegExTest2 {

    public static void main(String[] args) {

        String str1 = "1234";
        String str2 = "12asd";
        String str3 = "asdf";
        String str4 = "    ";
        String str5 = "";
        String str6 = "1";

        System.out.println(str1.matches("[0-9]+"));
        System.out.println(str2.matches("[0-9]+"));
        System.out.println(str3.matches("[0-9]+"));
        System.out.println(str4.matches("[0-9]+"));
        System.out.println(str5.matches("[0-9]+"));
        System.out.println(str6.matches("[0-9]+"));
    }

}
