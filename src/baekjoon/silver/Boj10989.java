package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj10989 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[10001];

        for (int i = 1; i <= N; i++) {

            int  current = Integer.parseInt(br.readLine());
            nums[current]++;
        }


        for (int i : nums) {
            System.out.println(i);
        }


    }

}
