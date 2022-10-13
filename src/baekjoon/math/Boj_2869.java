package baekjoon.math;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_2869 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = bf.readLine();


        StringTokenizer st = new StringTokenizer(input);
        int day = Integer.parseInt(st.nextToken());
        int night = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        int cnt = (height - night) / (day - night);
        if ((height - night) % (day - night) != 0) {
            cnt++;
        }

        String str = "";

        bw.write(str + cnt);
        bw.flush();
        bw.close();
    }

}
