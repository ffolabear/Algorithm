package baekjoon.catchStudy.string;

import java.io.*;

public class Palindrome {

    private static int isValid(String input) {
        System.out.println(input);
        StringBuilder sb = new StringBuilder(input);
        String fromHead = sb.toString();
        String fromBackward = sb.reverse().toString();

        if (fromHead.equals(fromBackward)) {
            return 0;
        } else {
            int cnt = 0;
            for (int i = 0; i < fromHead.length(); i++) {
                if (fromHead.charAt(i) != fromBackward.charAt(i)) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                return 1;
            } else {
                return 2;
            }
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        for (int i = 0; i < N; i++) {
            String input = br.readLine();
            bw.append(String.valueOf(isValid(input))).append('\n');
        }

        bw.flush();
        bw.close();

    }

}
