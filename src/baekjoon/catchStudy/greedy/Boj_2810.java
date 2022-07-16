package baekjoon.catchStudy.greedy;

import java.io.*;

public class Boj_2810 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String info = br.readLine();

        int cnt = 1;

        for (int i = 0; i < N; i++) {


            if (info.charAt(i) == 'S') {
                cnt++;
            } else {
                i ++;
                cnt++;
            }
        }

        if (cnt > N) {
            bw.append(String.valueOf(N));
        } else {
            bw.append(String.valueOf(cnt));

        }

        bw.flush();
        bw.close();

    }

}
