package Programmers.level02_1;

import java.util.ArrayList;
import java.util.List;

public class Dividing2Arr {

    public List<Long> solution(int n, long left, long right) {

        List<Long> list = new ArrayList<>();

        for (long i = left; i <= right; i++) {

            list.add(Math.max(i / n, i % n) + 1);
        }

        return list;
    }

    public static void main(String[] args) {

        Dividing2Arr sol = new Dividing2Arr();
        int n =7;
        int left = 14;
        int right =29;
        sol.solution(n, left, right);

    }

}
