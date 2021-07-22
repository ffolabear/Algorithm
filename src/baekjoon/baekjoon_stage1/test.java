package baekjoon.baekjoon_stage1;

import java.util.ArrayList;
import java.util.List;

public class test {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        for (int i = 0 ; i < 10; i ++){
            list.add(i);
        }
        System.out.println(list.size());
        list.get(0);
        System.out.println(list.subList(0, 8));
        System.out.println(list.size());

    }
}
