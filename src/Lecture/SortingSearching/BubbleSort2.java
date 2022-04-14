package Lecture.SortingSearching;

import java.util.Scanner;

/**
 * 위키 백과보고 거품정렬 구현하기
 *
 * 두 인접한 원소를 검사하여 정렬하는 방법
 *
 */

public class BubbleSort2 {

    private void solution(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {

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

        BubbleSort2 sol = new BubbleSort2();
        sol.solution(nums);

    }
}
