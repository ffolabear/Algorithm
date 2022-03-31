package Lecture.twopointer;

import java.util.Scanner;

public class MaximumProfit2 {

    private int solution(int N, int K, int[] arr) {


        int start = 0;
        int tempSum = 0;

        for (int i = 0; i < K; i++) {
            tempSum += arr[i];
        }

        int ans = tempSum;

        for (int i = K; i < N - 1; i++) {
            tempSum -= arr[start];
            start++;
            tempSum += arr[i];
            ans = Math.max(ans, tempSum);
        }



        return ans;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        MaximumProfit2 sol = new MaximumProfit2();
        System.out.println(sol.solution(N, K, arr));

    }
}
