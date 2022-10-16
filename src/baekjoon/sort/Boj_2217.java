package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Boj_2217 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();

        int divided = 0;

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            list.add(input);
            divided += input;
        }

        Collections.sort(list);
        divided /= N;

        if (N == 1) {
            System.out.println(divided);
        } else {

            for (int i = 0; i < N; i++) {
                if (list.get(i) < divided) {
                    continue;
                } else {
                    System.out.println(list.get(i - 1) * N);
                    break;
                }

            }
        }


    }

}
