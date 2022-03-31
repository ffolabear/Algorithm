package Lecture.twopointer;

import java.util.Scanner;

//인프런 저지 시간 초과 오류
public class MaximumProfit1 {

    private int solution(int N, int K, int[] arr) {

        int ans = Integer.MIN_VALUE;

        int start = 0;
        int end = 0;
        int tempSum = 0;
        //0 1 2 3 4 5 6 7 8 9
        //  1 2 3 4
        //    2 3 4 5
        //        ...
        //            6 7 8 9

        for (int i = 0; i < arr.length - K; i++) {

            start = i;
            tempSum = 0;
            tempSum += arr[start];
            end = start + 1;

            int cnt = 1;

            while (cnt < K) {
                tempSum += arr[end];
                end++;
                cnt++;
            }



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

        MaximumProfit1 sol = new MaximumProfit1();
        System.out.println(sol.solution(N, K, arr));

    }
}
