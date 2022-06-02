package baekjoon.dfs;

import java.util.ArrayList;
import java.util.Scanner;

public class Boj_2644 {

    static int n, a, b, m;
    static boolean[] visited;
    static ArrayList<Integer>[] node;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        a = in.nextInt();
        b = in.nextInt();
        m = in.nextInt();

        node = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            node[i] = new ArrayList<>();
        }

        for (int i = 0; i <= n; i++) {
            int from = in.nextInt();
            int to = in.nextInt();
            node[from].add(to);
            node[to].add(from);
        }

        System.out.println(n + " " + a + " " + b);
        System.out.println(node);
    }
}
