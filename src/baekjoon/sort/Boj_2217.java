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

        int sum = 0;

        for (int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            list.add(input);
        }

        Collections.sort(list, Collections.reverseOrder());
        int ans = 0;

        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, list.get(i) * (i + 1));
        }

        System.out.println(ans);
    }

}
