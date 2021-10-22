package Programmers.level02;

import java.util.Arrays;
import java.util.Comparator;

public class test {

    public static void main(String[] args) {

        String[] str = {"34", "66"};
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println(o1 + o2);
                System.out.println(o2 + o1);

                return 0;
            }
        });

    }

}
