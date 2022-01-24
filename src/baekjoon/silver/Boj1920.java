package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1920 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean[] nums = new boolean[N + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int token = Integer.parseInt(st.nextToken());
            nums[token] = true;
        }


        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {

            int current = Integer.parseInt(st.nextToken());

            if (current < 0 || current >= nums.length) {
                System.out.println(0);
            } else if (nums[current]) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }


    }


}
