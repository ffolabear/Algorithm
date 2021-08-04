package baekjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_10974 {


    static int N;
    static int[] visited;
    static StringBuilder sb = new StringBuilder();

    static void input() throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());
        visited = new int[N + 1];


    }

    static void func(int k) {

        if (k == N + 1) {
            for (int i = 1; i <= N; i++) {
                sb.append(visited[i]).append(" ");
            }
            sb.append("\n");
        } else {

            for (int i = 1; i <= N; i++) {

                boolean used = false;
                for (int j = 1; j < k; j++) {
                    if (i == visited[j]) {
                        used = true;
                    }
                }
                if (!used){
                    visited[k] = i;
                    func(k + 1);
                    visited[k] = 0;
                }


            }
        }
    }

    public static void main(String[] args) throws IOException {

        input();
        func(1);
        System.out.println(sb.toString());

    }

}
