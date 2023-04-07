package exams.woowacourse5th.week3;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Stringformat {

    public static void main(String[] args) {

        int totalPrize = 100005;
        int userMoney = 1000;

        double yield = ( totalPrize / (double) userMoney) * 100;
        System.out.println(yield);
        System.out.printf("%.2f", yield);
        System.out.println();

        yield = Math.round(yield * 100) / 100.0;

        System.out.println(yield);
        System.out.printf("%.2f", yield);


        String convertedYield = String.format("%.1f", yield);
        BigDecimal bigDecimal = BigDecimal.valueOf(Double.parseDouble(convertedYield)).setScale(1);
        DecimalFormat decimalFormat = new DecimalFormat("###,###");
//        System.out.println(decimalFormat.format(bigDecimal));
    }

}
