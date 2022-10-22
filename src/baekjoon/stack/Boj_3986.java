package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_3986 {

    static int cnt = 0;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String input = br.readLine();

            function(input);
        }



    }

    private static void function(String input) {

//        boolean a = false;
//        boolean b = false;
//        char init = ' ';

        boolean a = false;
        boolean b = false;
        char init = input.charAt(0);

        if (input.charAt(0) == 'A') {
            a = true;
        } else {
            b = true;
        }

        for (int i = 1; i < input.length(); i++) {
        }

    }

}
