package baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baek_15651 {

    static int N;
    static int M;
    static int[] nums;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nums = new int[M];
        recursion(0);
        System.out.println(sb.toString());

    }

    static void recursion(int k) {

        if (k == M) {
            for (int i = 0; i < M; i++) {
                sb.append(nums[i]).append(" ");
            }
            sb.append('\n');
        } else {
            for (int i = 1; i <= N; i++) {
                nums[k] = i;
                recursion(k + 1);
                nums[k] = 0;
            }


        }
    }

}
