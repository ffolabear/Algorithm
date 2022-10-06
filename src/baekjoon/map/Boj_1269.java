package baekjoon.map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Boj_1269 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<Integer> set = new HashSet<>();

        int[] A = new int[n];
        int[] B = new int[m];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            set.add(A[i]);
        }

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < m; i++) {
            B[i] = Integer.parseInt(st.nextToken());
            if (set.contains(B[i])) {
                set.remove(B[i]);
            } else {
                set.add(B[i]);
            }
        }

        System.out.println(set.size());

    }

}
