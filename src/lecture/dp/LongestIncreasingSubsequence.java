package lecture.dp;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //입력부
        int[] nums = new int[N];

        //[i]번째 숫자를 마지막 항으로 하는 최대 길이의 수열
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        arr[0] = 1;

        for (int i = 1; i < N; i++) {

            int max = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (nums[j] < nums[i] && arr[j] > max) {
                    max = arr[j];
                }
                arr[i] = max + 1;
            }

        }

        Arrays.sort(arr);
        System.out.println(arr[N - 1]);

    }

}
