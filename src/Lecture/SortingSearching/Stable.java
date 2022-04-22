package Lecture.SortingSearching;

import java.util.Arrays;
import java.util.Scanner;

public class Stable {

    static int[] nums;



    private void solution(int C) {

        int answer = 0;

        int lt = 1;
        int rt = nums[nums.length - 1];

        while (lt <= rt) {

            int mid = (lt + rt) / 2;
            if (count(mid) >= C) {
                answer = mid;
                lt = mid + 1;
            } else {
                rt = mid - 1;
            }

        }

        System.out.println(answer);
    }

    private int count(int mid) {
        int cnt = 1;
        int end = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - end >= mid) {
                cnt++;
                end = nums[i];
            }
        }


        return 0;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int C = in.nextInt();

        nums = new int[N];
        Arrays.sort(nums);

        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }

        Stable sol = new Stable();
        sol.solution(C);


    }


}
