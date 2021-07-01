package baekjoon_stage1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baek_2501 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        List<Integer> list = new ArrayList<>();

        if (N % 2 == 0) {

            for (int i = 1; i <= N / 2; i++) {

                if (N % i == 0) {
                    System.out.println(i);
                    list.add(i);
                }
            }

        } else {

            for (int i = 1; i < N / 2; i++) {

                if (N % i == 0) {
                    System.out.println(i);
                    list.add(i);
                }
            }

        }


        list.add(N);

        if (list.size() < K - 1) {
            System.out.println(0);
        } else {
            System.out.println(list.get(K - 1));

        }

    }

}
