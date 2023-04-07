package exams.woowacourse5th.week2.baseball;

import java.util.*;

public class test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 9; i++) {
            list.add(i);
        }

        for (int i = 9; i > 0; i--) {
            if (list.contains(i)) {
                System.out.println(list.contains(i));
                System.out.println(i + " list : " + list.get(list.indexOf(i)));
            }
        }

    }
}
