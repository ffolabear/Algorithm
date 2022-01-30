package baekjoon.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Boj10867_sortingWithoutDuplication {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] str = br.readLine().split(" ");
        int[] ans = new int[str.length];

        for (int i = 0; i < N; i++) {
            ans[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(ans);
        ArrayList<Integer> list = new ArrayList<>();

        int compare = 1001;

        for (int i = 0; i < N; i++) {
            if (compare != ans[i]) {
                list.add(ans[i]);
                compare = ans[i];
            } else {

                continue;
            }
        }

        for (int i : list) {
            bw.write(String.valueOf(i) + " ");
        }

        bw.flush();
        bw.close();
    }



}
