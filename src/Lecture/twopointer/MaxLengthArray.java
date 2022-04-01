package Lecture.twopointer;

import java.util.Scanner;

public class MaxLengthArray {

    private void solution(int[] arr, int K) {

        int ans = 0;

        int start = 0;
        int end = 0;

        int oneCnt = Integer.MIN_VALUE;
        int change = 0;

        if (arr[start] == 0) {
            change++;
        } else if (arr[start] == 1) {
            ans++;
            oneCnt++;
        }


        for (int i = 1; i < arr.length - 1; i++) {

            while (change <= K) {
                if (arr[i] == 1) {
                    oneCnt++;
                    ans++;
                    end++;
                } else if (arr[i] == 0) {
                    change++;
                }

            }

            ans = Math.max(ans, oneCnt);

        }

        System.out.println(ans);

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        MaxLengthArray sol = new MaxLengthArray();
        sol.solution(arr, K);

    }
}
