package sunday.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10872 {

    static int N;

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(bf.readLine());

        recursive(1, 1);

    }

    static void recursive(int i, int mul) {
        if (i >= N) {
            System.out.println(mul);
            return;

        } else {
            recursive(++i, i * mul);

        }

    }

}
