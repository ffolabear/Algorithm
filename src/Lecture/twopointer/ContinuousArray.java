package Lecture.twopointer;

import java.util.Scanner;

public class ContinuousArray {

    private int solution(int N, int M, int[] arr) {

        //1 2 1 3 1 1 1 2
        //{2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}

        int ans = 0;

        int start = 0;
        int end = 0;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            start = i;
            end = i;

            while (end < arr.length - 1) {

                if (sum >= M) {
                    break;
                }
                end++;
                sum += arr[end];
            }
            if (sum == M) {
                ans++;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = in.nextInt();
        }

        ContinuousArray sol = new ContinuousArray();

        System.out.println(sol.solution(N, M, arr));

    }


}
