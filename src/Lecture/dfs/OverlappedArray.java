package Lecture.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OverlappedArray {

    static int N, M;

    private void dfs(int c, boolean[] chk, List<Integer> list) {

        if (list.size() == M) {
            for (int i : list) {
                System.out.print(i + " ");
                System.out.println();
            }
            return;

        } else {
            for (int i = 1; i <= N; i++) {
//                if (!chk[i]) {
//                    list.add(i);
//                }
                System.out.println(i + " : " + chk[i]);
            }
//            System.out.println("배열의 크기  : " + list.size() + " " + list);

        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        OverlappedArray sol = new OverlappedArray();


        for (int i = 1; i <= N; i++) {
            List<Integer> list = new ArrayList<>();
            boolean[] chk = new boolean[N + 1];

            chk[i] = true;
//            System.out.println("int i : " + i);
            list.add(i);
            sol.dfs(i, chk, list);
        }


    }

}
