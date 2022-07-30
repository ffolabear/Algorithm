package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1439 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int zero = 0;
        int one = 0;

        if (str.charAt(0) == '1') {
            one++;
        } else {
            zero++;
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i- 1) != str.charAt(i)) {
                if (str.charAt(i) == '1') {
                    one++;
                } else {
                    zero++;
                }
            }
        }

        System.out.println(Math.min(one, zero));

    }

}
