package baekjoon.searching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Boj_2644_2 {

    static int n, a, b, m;
    static boolean[] visited;
    static ArrayList<Integer>[] node;
    static int ans = -1;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        m = Integer.parseInt(br.readLine());

        node = new ArrayList[n + 1];
        visited = new boolean[n + 1];

    }

}
