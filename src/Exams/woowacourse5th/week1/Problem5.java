package Exams.woowacourse5th.week1;

import java.util.ArrayList;
import java.util.List;

public class Problem5 {

    public static List<Integer> solution(int money) {

        List<Integer> answer = new ArrayList<>();
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1};

        for (int i = 0; i < unit.length; i++) {
            if (money >= unit[i]) {
                answer.add(money / unit[i]);
                money = money - (unit[i] * (money / unit[i]));
            } else {
                answer.add(0);
            }
        }
        return answer;
    }


}
