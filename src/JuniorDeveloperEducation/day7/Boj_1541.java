package JuniorDeveloperEducation.day7;

import java.io.*;
import java.util.StringTokenizer;

public class Boj_1541 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        String[] minus = input.split("-");

        int last = Integer.MIN_VALUE;

        for (int i = 0; i < minus.length; i++) {

            StringTokenizer st = new StringTokenizer(minus[i], "+");
            int temp = 0;

            while (st.hasMoreTokens()) {
                temp += Integer.parseInt(st.nextToken());
            }

            if (last == Integer.MIN_VALUE) {
                last = temp;
            } else {
                last -= temp;
            }
        }

        bw.append(String.valueOf(last));
        bw.flush();
        bw.close();

    }

}
