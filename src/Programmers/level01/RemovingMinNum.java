package Programmers.level01;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class RemovingMinNum {

    public List<Integer> solution(int[] arr) {

        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min(min, i);
        }

        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i != min) {
                list.add(i);

            }
        }

        if (list.size() == 0) {
            list.add(-1);
        }

        return list;
    }

    public static void main(String[] args) {

        RemovingMinNum sol = new RemovingMinNum();
        int[] arr = {4, 3, 2, 1};
//        int[] arr = {10};

        sol.solution(arr);
    }

}
