package baekjoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Boj1026_treasure {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        String[] inputA = br.readLine().split(" ");
        Integer[] A = new Integer[inputA.length];

        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(inputA[i]);
        }

        String[] inputB = br.readLine().split(" ");
        Integer[] B = new Integer[inputB.length];
        for (int i = 0; i < B.length; i++) {
            B[i] = Integer.parseInt(inputB[i]);
        }


        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());
        int answer = 0;

        for (int i = 0; i < A.length; i++) {
            answer += A[i] * B[i];
        }


        bw.write(String.valueOf(answer));

        bw.flush();
        bw.close();


    }

}