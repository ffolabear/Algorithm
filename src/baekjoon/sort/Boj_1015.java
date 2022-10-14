package baekjoon.sort;

import java.io.*;
import java.util.*;

class Elem implements Comparable<Elem> {

    int num;
    int idx;

    @Override
    public int compareTo(Elem other) {

        if (num != other.num) {
            return num - other.num;
        } else {
            return idx - other.idx;
        }
    }
}

public class Boj_1015 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        Elem[] B = new Elem[N];
        int[] P = new int[N];

        for (int i = 0; i < N; i++) {

            B[i] = new Elem();
            B[i].idx = i;
            B[i].num = Integer.parseInt(st.nextToken());
        }

        for (Elem e : B) {
            System.out.println(e.idx + " " + e.num);
        }

        System.out.println();
        Arrays.sort(B);

        for (int i = 0; i < N; i++) {
            P[B[i].idx] = i;
        }

        for (Elem e : B) {
            System.out.println(e.idx + " " + e.num);
        }

        for (int i = 0; i < N; i++) {
            bw.append(String.valueOf(P[i])).append(" ");
        }

        bw.flush();
        bw.close();

    }

}
