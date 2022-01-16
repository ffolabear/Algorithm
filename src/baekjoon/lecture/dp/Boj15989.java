package baekjoon.lecture.dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj15989 {

    static int[] nums;


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        nums = new int[T];

        for (int i = 0; i < T; i++) {
            nums[i] = Integer.parseInt(br.readLine());

            System.out.println(nums[i]);
        }


    }

    static int dp(int nums) {


        return 1;
    }

}
