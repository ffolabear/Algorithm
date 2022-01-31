package baekjoon.silver;

import java.io.*;
import java.util.StringTokenizer;

public class Boj10816_numCard2 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] input1 = br.readLine().split(" ");

        int[] arr1 = new int[N];

        for (int i = 0; i < arr1.length; i++) {

            arr1[i] = Integer.parseInt(input1[i]);

        }

        int M = Integer.parseInt(br.readLine());

        String[] input2 = br.readLine().split(" ");

        int[] arr2 = new int[N];

        for (int i = 0; i < arr2.length; i++) {

            arr2[i] = Integer.parseInt(input1[i]);

        }


    }

}
