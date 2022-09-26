package baekjoon.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11659 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];
        st = new StringTokenizer(br.readLine());

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //0 1 2 3 4
        //5 4 3 2 1
        //5 9 12 14 15

        //  1 2 3
        //    2 3 4
        //        4

        int from = 0;
        int to = 0;
        int sum = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());

            if (i == 0) {
                from = Integer.parseInt(st.nextToken());
                to = Integer.parseInt(st.nextToken());
                for (int j = from; j <= to; j++) {
                    sum += arr[j];
                }
            } else {



            }

        }


    }

}
