package lecture.twopointer;

import java.util.Scanner;

public class MaxLengthArray {

    private void solution(int[] arr, int K) {

        int ans = 0;

        int lt = 0;
        int change = 0;

        for (int rt = 0; rt < arr.length; rt++) {

            if (arr[rt] == 0) {
                change++;
            }

            while (change > K) {

                if (arr[lt] == 0) {
                    change--;
                }
                lt++;
            }

            ans = Math.max(ans, rt - lt + 1);
        }

        System.out.println(ans);


    }

    private void printCurrent(int lt, int rt, int[] arr) {
        for (int i = lt; i <= rt; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

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
