package exams.woowacourse5th.week3;

import java.math.BigDecimal;

public class RegExTest {

    public static void main(String[] args) {

//        float d = ((float) 2000000000 / (float) 1000) * 100;
//        System.out.println(d);
//
//        d = (float) (Math.round(d*100)/100.0);

        double d = ((double) 2000000000 / (double) 1000) * 100;
        System.out.println(d);

        d = (double) (Math.round(d*100)/100.0);
        System.out.println(d);
        BigDecimal bigDecimal = new BigDecimal(Double.parseDouble(String.valueOf(d)));
        String str = String.valueOf(bigDecimal);
        System.out.println(bigDecimal);

//        System.out.println(Math.round(d*100)/100.0);
//        System.out.println((float) Math.round(d*100)/100.0);
//        System.out.println(String.format("%.2f",d));
    }

}
