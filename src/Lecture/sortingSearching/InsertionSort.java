package Lecture.sortingSearching;

import java.util.Scanner;

public class InsertionSort {

    private void solution(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int temp = nums[i];
            int idx = i - 1;

            //인덱스가 0보다 크고 비교대상보다 클동안
            while (idx >= 0 && nums[idx] > temp) {
                nums[idx + 1] = nums[idx];
                idx--;

            }
            nums[idx + 1] = temp;

        }

        for (int i : nums) {
            System.out.print(i + " ");
        }


    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }

        InsertionSort sol = new InsertionSort();
        sol.solution(nums);

    }
}
