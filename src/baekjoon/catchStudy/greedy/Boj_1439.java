package baekjoon.catchStudy.greedy;

import java.io.*;

public class Boj_1439 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] input = br.readLine().toCharArray();

        int cntOne = 0;
        int cntZero = 0;

        if (input[0] == '0') {
            cntZero++;
        } else {
            cntOne++;
        }

        for (int i = 1; i < input.length; i++) {
            if (input[i - 1] == input[i]) {

                if (input[i] == '0') {
                    cntZero++;
                } else {
                    cntOne++;
                }

            }

        }

        bw.append(String.valueOf(Math.min(cntOne, cntZero)));
        bw.flush();
        bw.close();
    }
}
