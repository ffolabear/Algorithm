package Exams.woowacourse5th.week3;

import java.text.DecimalFormat;

public class DecimalFormatTest {

    public static void main(String[] args) {

        DecimalFormat format = new DecimalFormat("(###,###원)");
        DecimalFormat format2 = new DecimalFormat("(###,###)");
        String str =  format.format(2000000000);
        String str2 =  format2.format(10000000);
        System.out.println(str);
        System.out.println(str2);


    }

}
