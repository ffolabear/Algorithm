package baekjoon.catchStudy.string;

import java.io.*;

public class Palindrome {

    private static int isValid(String input) {
        System.out.println(input);
        StringBuilder sb = new StringBuilder(input);

        String fromHead = sb.toString();
        String fromBackward = sb.reverse().toString();

        String halfHead = fromHead.substring(0, input.length()/2);
        String halfBackward = fromBackward.substring(0, input.length()/2);

        if (fromHead.equals(fromBackward)) {
            return 0;
        } else {

            return 0;

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
