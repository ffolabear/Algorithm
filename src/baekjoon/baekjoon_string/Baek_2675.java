package baekjoon.baekjoon_string;

import java.io.*;

public class Baek_2675 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int k = 0; k < T; k++) {

            String testcase = br.readLine();
            String[] covt = testcase.split(" ");

            for (int i = 0; i < covt[1].length(); i++) {

                for (int j = 0; j < Integer.parseInt(covt[0]) ; j++) {
                    bw.write(covt[1].charAt(i));
                }

            }

            bw.write("\n");
        }


        bw.flush();
        bw.close();


    }
}
