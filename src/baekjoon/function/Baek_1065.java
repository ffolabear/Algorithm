package baekjoon.function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek_1065 {

    public static void main(String[] args) throws IOException {

        int answer = 0;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());


        if (N < 100) {
            answer = N;
        } else {

            answer = 99;



            for (int i = 100; i <= N; i++) {
                String covt = String.valueOf(i);
                String[] arr = covt.split("");

                if (verify(arr)) {
                    answer++;
                }

            }



        }
        System.out.println(answer);

    }

    static boolean verify(String[] arr) {

        int[] nums = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            nums[i] = Integer.parseInt(arr[i]);
        }

        int val = nums[0] - nums[1];
        System.out.println(val);

        boolean verify = false;

        for (int i = 1; i < arr.length - 1; i++) {

            if ((nums[i] - nums[i + 1]) == val) {
                verify = true;
            } else {
                verify = false;
            }


        }

        return verify;
    }


}
