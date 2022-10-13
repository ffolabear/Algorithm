package baekjoon.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2908 {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        StringBuffer buffer;

        String[] nums = str.split(" ");

        for (int i = 0; i < nums.length; i++) {

            buffer = new StringBuffer(nums[i]);
            nums[i] = buffer.reverse().toString();
        }

        int answer = Math.max(Integer.parseInt(nums[0]), Integer.parseInt(nums[1]));
        System.out.println(answer);

    }
}
