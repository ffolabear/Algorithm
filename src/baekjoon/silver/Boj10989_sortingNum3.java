package baekjoon.silver;

import java.io.*;

public class Boj10989_sortingNum3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[10001];

        for (int i = 1; i <= N; i++) {

            int  current = Integer.parseInt(br.readLine());
            nums[current]++;
        }


        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                while (nums[i] != 0) {
                    bw.write(i + "\n");
                    nums[i]--;
                }

            }
        }

        bw.flush();
        bw.close();

    }

}
