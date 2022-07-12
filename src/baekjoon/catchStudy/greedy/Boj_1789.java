package baekjoon.catchStudy.greedy;

import java.io.*;

public class Boj_1789 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());

        long sum = 0L;
        int count = 0;

        for (int i = 1; ;i++) {

            if (sum > N) {
                break;
            }

            sum += i;
            count++;

        }

        bw.append(String.valueOf(count - 1));
        bw.flush();
        bw.close();

    }

}

