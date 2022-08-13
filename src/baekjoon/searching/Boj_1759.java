package baekjoon.searching;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1759 {

    static int L, C;
    static char[] arr;
    static boolean[] isUsed;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        isUsed = new boolean[C];
        String str = br.readLine().replace(" ", "");
        arr = str.toCharArray();
        Arrays.sort(arr);

        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {

            StringBuilder sb = new StringBuilder();
            dfs(i + 1, sb);
        }

    }

    private static void dfs(int idx, StringBuilder sb) {

        if (sb.length() == L) {
            System.out.println(sb);
            return;
        } else {

            isUsed[idx] = true;
            sb.append(arr[idx]);

            for (int i = idx; i < arr.length; i++) {
                if (!isUsed[i]) {
                    dfs(i, sb);
                }
            }

        }
    }

}
