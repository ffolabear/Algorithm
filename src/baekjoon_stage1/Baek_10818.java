package baekjoon_stage1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Baek_10818 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i =0; i < N; i ++){
            int num = sc.nextInt();
            list.add(num);

        }
        Collections.sort(list);
        System.out.print(list.get(0) + " ");
        System.out.print(list.get(list.size() -1));

    }
}
