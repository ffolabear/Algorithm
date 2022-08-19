package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj_11399 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] time = new int[N];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            time[i] = Integer.parseInt(input[i]);
        }

        int ans = 0;
        int sum = 0;

        Arrays.sort(time);

        for (int i = 0; i < time.length; i++) {
            sum += time[i];
            ans += sum;
        }

        System.out.println(ans);


    }

}
