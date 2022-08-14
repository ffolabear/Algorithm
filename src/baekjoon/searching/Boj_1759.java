package baekjoon.searching;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1759 {

    static int L, C;
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static char[] arr;
    static boolean[] isUsed;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


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

        dfs(0, 0);

        bw.flush();
        bw.close();

    }

    private static void dfs(int idx, int cnt) throws IOException {

        if (cnt == L) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < C; i++) {
                if (isUsed[i]) {
                    sb.append(arr[i]);
                }
            }

            if (isValid(sb)) {
                bw.append(sb).append('\n');
            }


        } else {

            for (int i = idx; i < C; i++) {

                isUsed[i] = true;
                dfs(i + 1, cnt + 1);
                isUsed[i] = false;
            }

        }
    }

    private static boolean isValid(StringBuilder sb) {

        int cntVowel = 0;
        int cntConsonant = 0;

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == 'a' || sb.charAt(i) == 'e' || sb.charAt(i) == 'i' || sb.charAt(i) == 'o' || sb.charAt(i) == 'u') {
                cntVowel++;
            } else {
                cntConsonant++;
            }
        }

        if (cntVowel >= 1 && cntConsonant >= 2) {
            return true;
        }

        return false;
    }

}
