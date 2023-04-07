package lecture.sortingSearching;

import java.util.Scanner;

public class BubbleSort {

    private void solution(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }


            }
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

        BubbleSort sol = new BubbleSort();
        sol.solution(nums);

    }
}
