package baekjoon.lecture.bruteforce.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj14888 {

    static int N;
    static int[] nums;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        nums = new int[N];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }



        for (int i : nums) {
            System.out.print(i + " ");
        }


    }

}
