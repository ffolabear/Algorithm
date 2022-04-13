package Lecture.SortingSearching;

import java.util.Scanner;

public class SelectionSort {

    private void solution(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int idx = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[idx]) {
                    idx = j;
                }
            }

            int temp = nums[idx];
            nums[idx] = nums[i];
            nums[i] = temp;
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

        SelectionSort sol = new SelectionSort();
        sol.solution(nums);

    }

}
