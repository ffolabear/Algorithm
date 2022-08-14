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

        for (int i = 0; i < C; i++) {
            dfs(i, new StringBuilder());

        }

        bw.flush();
        bw.close();

    }

    private static void dfs(int idx, StringBuilder sb) throws IOException {

        if (sb.length() == L) {
            if (isValid(sb)) {
                bw.append(sb.toString()).append('\n');
            }
            return;

        } else {

//            isUsed[idx] = true;
//            sb.append(arr[idx]);

            for (int i = idx; i < C; i++) {
                sb.append(arr[i]);
                dfs(i + 1, sb);
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
