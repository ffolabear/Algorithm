package exams.woowacourse5th.week2;

public class RegExTest {

    public static void main(String[] args) {

//        String str1 = "1";
//        String str2 = "2";
//        String str3 = "12";
//        String str4 = "312";
//        String str5 = "ab";
//        String str6 = "  ";
//
//        System.out.println(str1.matches("[12]"));
//        System.out.println(str2.matches("[12]"));
//
//        System.out.println(str3.matches("[12]"));
//        System.out.println(str4.matches("[12]"));
//
//        System.out.println(str5.matches("[12]"));
//        System.out.println(str6.matches("[12]"));

        String str7 = "111";
        String str8 = "222";
        String str9 = "333";
        String str10 = "44";
        String str11 = "5";
        String str12 = "6";

//        System.out.println(str7.matches("[0-9]{3}"));
        System.out.println(str7.matches("^(.)(\\1)+$"));
        System.out.println(str8.matches("^(.)(\\1)+$"));
        System.out.println(str9.matches("^(.)(\\1)+$"));
        System.out.println(str10.matches("^(.)(\\1)+$"));
        System.out.println(str11.matches("^(.)(\\1)+$"));
        System.out.println(str12.matches("^(.)(\\1)+$"));

//        System.out.println(str8.matches("[0-9]{3}"));



    }

}
