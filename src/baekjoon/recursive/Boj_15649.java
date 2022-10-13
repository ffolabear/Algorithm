package baekjoon.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_15649 {

    static int N, M;
    static int[] nums;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        nums = new int[M + 1];
        recursion(1);
        System.out.println(sb);

    }

    static void recursion(int k) {

        if (k == M + 1) {

            for (int i = 1; i <= M; i++) {
                sb.append(nums[i]).append(" ");
            }
            sb.append("\n");


        } else {

            for (int i = 1; i <= N; i++) {

                boolean isUsed = false;
                for (int j = 1; j < k; j++) {
                    if (i == nums[j]) {
                        isUsed = true;
                    }

                }
                if (!isUsed) {
                    nums[k] = i;
                    recursion(k + 1);
                    nums[k] = 0;
                }


            }

        }

    }

}
