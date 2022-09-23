package baekjoon.dp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Boj_9095 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int[] dp = new int[12];

        for (int i = 0; i < T; i++) {
            int current = Integer.parseInt(br.readLine());

            dp[1] = 1;
            dp[2] = 2;
            dp[3] = 4;

            for (int j = 4; j <= current; j++) {
                dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
            }
            bw.append(String.valueOf(dp[current])).append("\n");
        }
        bw.flush();
        bw.close();

    }

}
